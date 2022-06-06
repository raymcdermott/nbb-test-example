(ns example-test
  (:require
    [example :as e]
    [cljs.test :as t :refer [deftest is testing]]))

(deftest bad-headers
         (let [headers (-> (e/get-headers))]
              (is (string? (:x-mod-nonce headers)))
              (is (string? (:Authorization headers)))
              (is (string? (:Date headers)))))

; cd test && npx nbb --classpath ../src -m example-test/run-tests
(defn run-tests []
      (t/run-tests 'example-test))
