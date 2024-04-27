/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1051           |
| Imposto de Reda    |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	float renda, aux;
	scanf("%f",&renda);
	
	if (renda >= 0.00 && renda <= 2000.00)
		printf("Isento\n");
	else if (renda > 2000.00 && renda <= 3000.00)
		printf("R$ %.2f\n",(renda-2000)*8/100);
	else if (renda > 3000.00 && renda <= 4500.00) {
		aux = (1000*8/100) + ((renda-3000)*18/100);
		printf("R$ %.2f\n",aux);
	}
	else {
		aux = (1000*8/100) + (1500*18/100) + ((renda-4500)*28/100);
		printf("R$ %.2f\n",aux);
	}
}
