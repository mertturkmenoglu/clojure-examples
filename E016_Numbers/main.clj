(ns E016_Numbers)

(defn main []
    (println (type 42))
    (println (type 3.14))
    (println (type "Emily"))
    (def number 42)
    (println (zero? number))
    (println (pos? number))
    (println (neg? number))
    (println (even? number))
    (println (odd? number))
    (println (number? "E"))
    (println (int? number))
    (println (float? 3.14)))

(main)