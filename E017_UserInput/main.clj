(ns E017_UserInput)

(defn main []
    (println "Enter something: ")
    (def inp (read-line))
    (print "You entered: ")
    (println inp)
    (print "Type of the input -> ")
    (println (type inp))) ;; Always reads as String

(main)