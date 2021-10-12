(ns clojure-web-ring.core-test
  (:require [clojure.test :refer :all]
            [clj-http.client :as http]
            [clojure-web-ring.core :as app]))

(use-fixtures
  :once
  (fn [f]
    (let [server (ring.adapter.jetty/run-jetty
                    #'app/handler
                    {:port 1234 :join? false})]
      (try
        (f)
        (finally
          (.stop server))))))

(deftest invalid-login-test
  (let [response (http/get "http://localhost:1234")]
    (is (= "Hello World" (:body response)))))
