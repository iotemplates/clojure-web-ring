(defproject clojure-web-ring "0.1.0-SNAPSHOT"
  :description "A basic template for clojure projects."
  :url "http://github.com/iotemplates/clojure-web-ring"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2020
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 ]

  :main ^:skip-aot clojure-web-ring.core
  :target-path "target/%s"
  :profiles {:test {:dependencies
                    [[clj-http "3.12.3"]]}
             :uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
