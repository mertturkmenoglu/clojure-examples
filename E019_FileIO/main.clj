(ns E019_FileIO)

;; Read entire file as a string
(defn main []
    (def content (slurp "input.txt"))
    (println "Content of the file:")
    (println "")
    (println content))

(main)