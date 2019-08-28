(ns E025_Set (:require [clojure.set :as set]))

(defn main []
    (println (set '(0 2 4 6 8)))
    (println (sorted-set 1 2 2 4))
    (println (get (sorted-set 1 2 2 4) 4)) ;; get the element 4 not the index
    (println (contains? (sorted-set 1 2 2 4) 4))
    (println (conj (sorted-set 1 2 3) 4)) ;; append
    (println (disj (sorted-set 1 2 3) 3)) ;; remove
    (println (set/union (sorted-set 1 2) (sorted-set 2 3))) ;; combine
    (println (set/difference (sorted-set 1 2) (sorted-set 2 3)))
    (println (set/intersection (sorted-set 1 2) (sorted-set 2 3)))
    (println (set/subset? (sorted-set 1 2) (sorted-set 1 2 3)))
    (println (set/superset? (sorted-set 1 2) (sorted-set 1))))

(main)