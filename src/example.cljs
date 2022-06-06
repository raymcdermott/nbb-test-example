(ns example
  (:require [modulr :refer [->modulr-headers]]))

(defn get-headers
      []
      (let [headers (-> (->modulr-headers) (js->clj :keywordize-keys true))]
           (prn :headers headers)
           headers))

(defn handler [event _ctx]
      ;; to demonstrate access using node
      (get-headers))

(handler {} nil)

;; exports
#js {:handler handler}
