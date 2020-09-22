/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2161            |
| Raiz Quadrada de 10 |
*---------------------*/
# -*- coding: utf-8 -*-
N=int(input())
cont=N
x=(1/6)
aux=(1/6)
if N==0:
   print("%.10f" %(3))
else:
    while cont >= 2:
        aux=(1/(6+aux))
        cont=cont-1
    print("%.10f" %(3+aux))