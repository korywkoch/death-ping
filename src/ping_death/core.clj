(ns ping-death.core
  (:require [clj-http.client :as client])
  (:require [clojure.string :as str])
  (:gen-class))

(defn has-protocol?
  [url]
  (str/starts-with? url "http://"))

(defn ping-url
  [url]
  (client/get
    (if (has-protocol? url)
      url
      (str "http://" url))))

(defn -main
  "Call client/get on each provided argument."
  [& args]
  (doseq [item args]
    (prn item)
    (ping-url item)))
