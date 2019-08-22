(ns E009_Ifdo)

;; Allows mutliple statements inside branches
(defn main[]
    (if (= 1 1)
    (do (println "Equal")
        (println "True"))
    (do (println "Not Equal")
        (println "False"))))

(main)