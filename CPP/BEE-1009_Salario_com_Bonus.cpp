/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1009           |
| Salario com Bonus  |
*--------------------*/
#include<stdio.h>
#include<iostream>
using namespace std;

int main()
{
	float salario, vendas, total;
	char vendedor[100];
	scanf("%s",&vendedor);
	scanf("%f",&salario);
	scanf("%f",&vendas);
	total = salario + (15*vendas)/100;
	printf("TOTAL = R$ %.2f\n", total);
}
