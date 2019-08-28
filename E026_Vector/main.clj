(ns E026_Vector)

(defn main [] 
    (println (vector 0 2 4 6 8))
    (println (vector-of :boolean true false false))
    (println (nth (vector 1 3 5) 2))
    (println (get (vector 1 3 5) 1))
    (println (conj (vector 1 3 5) 7))
    (println (pop (vector 1 3 5)))
    (println (subvec (vector 1 2 3 4 5 6 7 8 9) 2 4)))

(main)