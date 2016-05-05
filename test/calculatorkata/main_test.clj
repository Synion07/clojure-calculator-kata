(ns calculatorkata.main-test
    (:use [calculatorkata.main])
    (:use [clojure.test])
    (:use [midje.sweet])
    )

(deftest test-adds-numbers
         (facts "Calculator adds correctly"
                (fact "Adds two valid numbers"
                      (calculate "2+2") => 4)
           )
  )