(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result for the given input value."
  [x]
  (if (= x 0) 0
    (if (= x 1) 1
      (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
    )
  )
)




