/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1013           |
| O Maior            |
*--------------------*/
#include<stdio.h>
#include <stdlib.h>     /* abs */
using namespace std;

int main() {

	int a,b,c,maiorAB, maiorABC;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);

	maiorAB = (a+b + abs(a-b))/2;
	maiorABC = (maiorAB+c + abs(maiorAB-c))/2;

	printf("%d eh o maior\n",maiorABC);

	return 0;
}
