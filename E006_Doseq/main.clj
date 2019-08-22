(ns E006_Doseq)

;; Like for-each loop
(defn main []
    (doseq [n [0 1 2 3 4 5]]
    (println n)))

(main)