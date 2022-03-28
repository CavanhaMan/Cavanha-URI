/*-------------------*
| Rodrigo CavanhaMan |
| URI 1038           |
| Lanche             |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	int cod;
	double quant;
	scanf("%d",&cod);
	scanf("%lf",&quant);

	if(cod == 1)
		printf("Total: R$ %.2lf\n",(4.00*quant));	
	if(cod == 2)
		printf("Total: R$ %.2lf\n",(4.50*quant));	
	if(cod == 3)
		printf("Total: R$ %.2lf\n",(5.00*quant));	
	if(cod == 4)
		printf("Total: R$ %.2lf\n",(2.00*quant));	
	if(cod == 5)
		printf("Total: R$ %.2lf\n",(1.50*quant));	

	return 0;
}
