/*-------------------*
| Rodrigo CavanhaMan |
| URI 1067           |
| Numeros Impares    |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int x, aux = 1;
	scanf("%d",&x);
	while (aux <= x) {
		if (aux % 2!= 0)
			printf("%d\n",aux);
		aux = aux + 1;
	}
}
