(defproject clojure-calculator-kata "0.1.0-SNAPSHOT"
  :description "Coljure Calculator Kata"
  :url "NONE"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot my-stuff.core
  :target-path "target/%s"
  :profiles {
             :dev {
                   :dependencies [[midje "1.6.3"]]
                   }
             :uberjar {
                       :aot :all
                       }
             }
  )