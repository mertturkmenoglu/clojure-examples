(ns E005_WhileLoop)

(defn main []
    (def i (atom 0))
    (while (< @i 10)
        (do
            (println @i)
            (swap! i inc))))

(main)