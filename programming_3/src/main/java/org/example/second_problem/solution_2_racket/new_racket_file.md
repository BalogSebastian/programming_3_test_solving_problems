#lang racket/base
(writeln
(map (lambda (x) (if ( even? x) (* x x) x)) (list 1 2 3 4)))