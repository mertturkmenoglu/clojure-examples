(ns E018_RecursiveLoop)

(defn main []
    (loop [i 0]
        (when (< i 10)
        (println i)
        (recur (inc i)))))

(main)