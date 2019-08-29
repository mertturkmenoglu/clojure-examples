(ns E028_AckermannFunction)

(defn ack [m n]
    (cond
        (zero? m) (inc n)
        (zero? n) (recur (dec m) 1)
        :else (ack (dec m) (ack m (dec n)))))

(defn main []
    (println (ack 3 11)))

(main)