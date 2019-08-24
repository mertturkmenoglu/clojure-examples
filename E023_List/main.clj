(ns E023_List)

(defn main []
    (println (list 1 1 2 3 5 8 13 21))
    (println (first (list 0 2 4 6 8)))
    (println (nth (list 1 3 5 7 9) 3))
    (println (cons 1 (list 3 5 7 9)))
    (println (conj (list 1 3 5) 7 9))
    (println (rest "abc")))

(main)