(ns E022_Strings)

(defn main []
    (println (str "Hello" " " "Emily"))
    (println (format "Hello Emily %d times" 42))
    (println (str "Emily: " (count "Emily")))
    (println (subs "Emily" 2 3))
    (println (str "Compare Emily and Diana: " (compare "Emily" "Diana")))
    (println (str "To lower case: " (clojure.string/lower-case "Emily")))
    (println (str "To upper case: " (clojure.string/upper-case "Emily")))
    (println (str "Join: " (clojure.string/join " " ["Emily" "is" "the" "best"])))
    (println (str "Split: " (clojure.string/split "Emily is the best" #" ")))
    (println (str "Split lines: " (clojure.string/split-lines "Emily\nDiana")))
    (println (str "Reverse: " (clojure.string/join "" (reverse "Emily"))))
    (println (str "Replace: " (clojure.string/replace "I am Diana" #"Diana" "Emily"))))

(main)