/*-------------------*
| Rodrigo CavanhaMan |
| URI 1253           |
| Cifra de Cesar     |
*--------------------*/
# -*- coding: utf-8 -*-
textobase=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
textosaida=[]
indice1 = 0
indice2 = 0
N=int(input())          # quantidade de casos de teste
while N>0:
    entrada=input()
    textocod=(list(entrada))
    desloca=int(input())    # quantas posições será deslocado
    while indice1 < len(textobase):
        while indice2 < len(textocod):
            if textocod[indice2]!=textobase[indice1]:
                indice1=indice1+1
            else:
                textosaida[indice2:1]=textobase[indice1-desloca]
                indice2=indice2+1
                indice1=0
        indice1=indice1+1
    print("".join(textosaida))
    textosaida=[]
    indice1 = 0
    indice2 = 0
    N=N-1