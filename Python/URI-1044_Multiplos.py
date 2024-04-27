/*-------------------*
| Rodrigo CavanhaMan |
| URI 1003           |
| Multiplos          |
*--------------------*/
# -*- coding: utf-8 -*-

A,B = map(int,input().split())

if A%B == 0 or B%A == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")