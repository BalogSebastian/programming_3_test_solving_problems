#lang racket/base

(define list1 (list 1 2 3 4))

;; Mapping x -> x + 1 and printing each element
(for-each (lambda (x) (displayln (+ x 1))) list1)

;; Mapping x -> x + 1 if x is even, otherwise x, and printing each element
(for-each
(lambda (x)
(displayln (if (even? x)
(+ x 1)
x)))
list1)
