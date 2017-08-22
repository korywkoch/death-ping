(ns ping-death.core-test
  (:require [clojure.test :refer :all]
            [ping-death.core :refer :all]))

(deftest has-protocol-test
  (testing "should normalize non-protocol'd urls."
    (is true (has-protocol? "http://koryko.ch"))
    (is (false? (has-protocol? "koryko.ch")))))
