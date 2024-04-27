/*-------------------*
| Rodrigo CavanhaMan |
| URI 1214           |
| Acima da Media     |
*--------------------*/
# -*- coding: utf-8 -*-
C=int(input())
calculos={}
maiorqmedia=0
while C>0:
    listatxt=input()
    valores=[int(s) for s in listatxt.split(' ')]
    N = valores[0] 
    del valores[0]
    def media(valores):
        qtd_elementos = len(valores)
        media=(sum(valores))/float(qtd_elementos)
        return media
    calculos['media']=media(valores)
    for x in valores:
        if x > calculos['media']:
            maiorqmedia=maiorqmedia+1
    percentmaior=maiorqmedia*100/N
    print("%.3f%%" %percentmaior)
    maiorqmedia=0
    C=C-1