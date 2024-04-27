/*
+--------------------+
¦ Rodrigo CavanhaMan ¦
¦        IFTM        ¦
¦      BEE 1003      ¦
+--------------------+
*/
# -*- coding: utf-8 -*-

A,B = map(int,input().split())

if A%B == 0 or B%A == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")