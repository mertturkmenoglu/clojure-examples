(ns E013_Functions)

(defn strConcat [fst & rest]
    (str fst (clojure.string/join " " rest)))

(defn main []
    (println (strConcat "Emily " "Diana" "Barbara")))

(main)
