/*-------------------*
| Rodrigo CavanhaMan |
| URI 1028           |
| Figurinhas         |
*--------------------*/
# -*- coding: utf-8 -*-
N=int(input())
while N>0:
    F1,F2 = map(int,input().split())
    #inicio formula MDC
    def mdc(a,b):
        if b == 0:
            return a
        return mdc(b, a % b)
    print(mdc(F1,F2))
    #fim formula MDC
    N=N-1
