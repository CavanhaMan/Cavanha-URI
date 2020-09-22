/*-------------------*
| Rodrigo CavanhaMan |
| URI 2242           |
| Huaauhahhuahau     | 
*--------------------*/
# -*- coding: utf-8 -*-
RISADA = (input ())
lol = []
for x in RISADA:
    if x=="a" or x=="e" or x=="i" or x=="o" or x=="u":
        lol.append(x)
#print("".join(lol))
if lol==lol[::-1]:
    print("S")
else:
    print("N")
#print(RISADA[::-1])