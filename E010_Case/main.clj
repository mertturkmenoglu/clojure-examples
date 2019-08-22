(ns E010_Case)

;; Like switch-case in other languages
;; or pattern match
(defn main []
    (def person "Emily")
    (case person 
        "Emily" (println "Emily is the best")
        "Diana" (println "Diana is good")
        (println "I don't know the person")))

(main)