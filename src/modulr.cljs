(ns modulr
  (:require
    ["./signature$default" :as modulr-hmac]))

(def ^:private hmac-helper
 (new modulr-hmac "api-key" "api-secret"))

(defn ->modulr-headers []
  (.getHTTPHeaders (.calculate hmac-helper)))

