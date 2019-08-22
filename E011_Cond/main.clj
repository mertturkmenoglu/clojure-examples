(ns E011_Cond)

(defn main []
    (def number 42)
    (cond
        (= number 42) (println "Number is 42. You find the answer.")
        (= number 13) (println "Number is 13. Unlucky.")
        :else (println "I am not sure")))

(main)