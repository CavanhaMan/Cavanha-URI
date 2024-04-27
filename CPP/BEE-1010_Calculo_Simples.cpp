/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1010           |
| Calculo Simples    |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int cod1,num1,cod2,num2;
	float vlr1,vlr2,vlrpagar;
	scanf("%d",&cod1);
	scanf("%d",&num1);
	scanf("%f",&vlr1);
	scanf("%d",&cod2);
	scanf("%d",&num2);
	scanf("%f",&vlr2);
	vlrpagar = (num1*vlr1)+(num2*vlr2); 
	printf("VALOR A PAGAR: R$ %.2f\n", vlrpagar);
}

