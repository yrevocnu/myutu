(ns myutu-clj.core
  (:gen-class))

; Note sure if require conventionally comes before or after ns
(require '[clj-yaml.core :as yaml])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println
    (yaml/generate-string
      [{:name "John Smith", :age 33}
       {:name "Mary Smith", :age 27}])
    (yaml/parse-string "
    - {name: John Smith, age: 33}
    - name: Mary Smith
      age: 27
    ") ))
