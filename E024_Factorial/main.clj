(ns E024_Factorial)

(defn factorial [n]
    (if (<= n 1) 
    1 
    (* n (factorial (dec n)))))

(defn main []
    (println (factorial 5))
    (println (factorial 4)))

(main)