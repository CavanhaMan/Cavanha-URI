/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1019           |
| Conversao de Tempo |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	int n,hora,min;
	scanf("%d",&n);

	if (n >= 3600){
		hora = n / 3600;
		n = n % 3600;
		printf("%d:", hora);
	}
	else
		printf("0:");

	if (n >= 60){
		min = n / 60;
		n = n % 60;
		printf("%d:", min);
	}
	else
		printf("0:");

	printf("%d\n", n);

	return 0;
}
