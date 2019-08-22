(ns E014_Functions)

(defn doubleNumber [n]
    ((fn [x] (* 2 x)) n))

(defn main []
    (println (doubleNumber 5))
    (println ((fn [x] (* 2 x)) 5)))

(main)