/*
+--------------------+
� Rodrigo CavanhaMan �
�        IFTM        �
�      BEE 1133      �
+--------------------+
*/
A,B,C = map(int,input().split() )
MaiorAB = ((A+B+abs(A-B))/2)
MaiorABC = ((MaiorAB+C+abs(MaiorAB-C))/2)
print("%.0i eh o maior" %MaiorABC)