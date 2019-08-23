(ns E020_FileIO)

;; Read entire file
;; Line by line
(defn main []
    (println "Content of the file")
    (println)
    (with-open [rdr (clojure.java.io/reader "input.txt")]
    (println (reduce conj [] (line-seq rdr)))))

(main)