(defproject myutu-clj "0.1.0-SNAPSHOT"
  :description "For now, an experiment parsing YAML with Clojure"
  :url "http://github.com/glass-bead-labs/myutu"
  ; We should figure out what license we're using before going public. Sticking
  ; with default for lein presently
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [circleci/clj-yaml "0.5.5"]]
  :main ^:skip-aot myutu-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
