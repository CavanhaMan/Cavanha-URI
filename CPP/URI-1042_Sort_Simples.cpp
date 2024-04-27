/*-------------------*
| Rodrigo CavanhaMan |
| URI 1042           |
| Sort Simples       |
*--------------------*/
#include<stdio.h>
#include <algorithm>
using namespace std;

int main() {

	int a,b,c,aux1,aux2,aux3;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);

	aux1 = min(a, min(b, c));
	aux2 = min(a, b);
	aux3 = max(a, b);

	if (aux1 == a){
		aux2 = min(b, c);
		aux3 = max(b, c);
	}
	if (aux1 == b){
		aux2 = min(a, c);
		aux3 = max(a, c);
	}
	if (aux1 == c){
		aux2 = min(a, b);
		aux3 = max(a, b);
	}

	printf("%d\n",aux1);
	printf("%d\n",aux2);
	printf("%d\n",aux3);

	printf("\n");

	printf("%d\n",a);
	printf("%d\n",b);
	printf("%d\n",c);
	return 0;
}
