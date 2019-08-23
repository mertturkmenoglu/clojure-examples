(ns E021_FileIO)

(defn main []
    (println "Enter something to write file: ")
    (def content (read-line))
    (spit "output.txt" content)
    (println "Go check the file"))

(main)