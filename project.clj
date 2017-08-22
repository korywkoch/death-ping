(defproject death-ping "0.1.0-SNAPSHOT"
  :description "Clojure app to ping an arbitrary list of servers"
  :url "http://github.com/korywkoch/death-ping"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [clj-http "3.7.0"]
  ]
  :main ^:skip-aot ping-death.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
