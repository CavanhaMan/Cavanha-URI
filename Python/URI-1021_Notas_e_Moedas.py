/*-------------------*
| Rodrigo CavanhaMan |
| URI 1021           |
| Notas e Moedas     |
*--------------------*/
# -*- coding: utf-8 -*-
MONEYA,MONEYB = map (int, input().split(".") )

print ("NOTAS:")

print ("%.0i nota(s) de R$ 100.00" %(MONEYA/100))
MONEYA = MONEYA%100

print ("%.0i nota(s) de R$ 50.00" %(MONEYA/50))
MONEYA = MONEYA%50

print ("%.0i nota(s) de R$ 20.00" %(MONEYA/20))
MONEYA = MONEYA%20

print ("%.0i nota(s) de R$ 10.00" %(MONEYA/10))
MONEYA = MONEYA%10

print ("%.0i nota(s) de R$ 5.00" %(MONEYA/5))
MONEYA = MONEYA%5

print ("%.0i nota(s) de R$ 2.00" %(MONEYA/2))
MONEYA = MONEYA%2

print ("MOEDAS:")

print ("%.0i moeda(s) de R$ 1.00" %(MONEYA/1))
MONEYA = MONEYA%1

print ("%.0i moeda(s) de R$ 0.50" %(MONEYB/50))
MONEYB = MONEYB%50

print ("%.0i moeda(s) de R$ 0.25" %(MONEYB/25))
MONEYB = MONEYB%25

print ("%.0i moeda(s) de R$ 0.10" %(MONEYB/10))
MONEYB = MONEYB%10

print ("%.0i moeda(s) de R$ 0.05" %(MONEYB/5))
MONEYB = MONEYB%5

print ("%.0i moeda(s) de R$ 0.01" %(MONEYB/1))
MONEYB = MONEYB%1