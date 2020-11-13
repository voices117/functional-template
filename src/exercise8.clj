(ns exercise8)

(defn square 
  "Returns the square of a given number"
  [x]
  (* x x)
)

(defn fderive
  "Returns a function that approximates the derive of f with error h in the value given to the returned function."
  [f h]
  #(/ 
    (-
      (f (+ % h))
      (f (- % h))
    )
    (* h 2)
  )
)




