/*-------------------*
| Rodrigo CavanhaMan |
| URI 1042           |
| Sort Simples       |
*--------------------*/
# -*- coding: utf-8 -*-

A,B,C = map (int,input().split())
LISTA = [A, B, C]
for x in sorted(LISTA):
    print (x)
print("")
print(A)
print(B)
print(C)