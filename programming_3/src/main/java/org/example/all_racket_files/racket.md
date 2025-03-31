#lang racket/base

(define list1 (list 1 2 3 4))

;; Printing even numbers from the list
(for-each (lambda (x)
(when (even? x)
(displayln x)))
list1)