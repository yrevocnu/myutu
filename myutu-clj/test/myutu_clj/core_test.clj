(ns myutu-clj.core-test
  (:require [clojure.test :refer :all]
            [myutu-clj.core :refer :all]))

(deftest main-works
  (testing "Do we parse?"
    (is (not-empty (-main "../design-notes.yaml")))
