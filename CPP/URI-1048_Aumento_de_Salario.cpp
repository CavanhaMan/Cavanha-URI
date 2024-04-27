/*-------------------*
| Rodrigo CavanhaMan |
| URI 1048           |
| Aumento de Salario |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	double salario,reajuste,percentual;

	scanf("%lf",&salario);

	if (salario >= 0.00 && salario <= 400.00) {
		percentual = 15.00;
		reajuste = salario * percentual / 100;
	}
	else if (salario > 400.00 && salario <= 800.00) {
		percentual = 12.00;
		reajuste = salario * percentual / 100;
	}
	else if (salario > 800.00 && salario <= 1200.00) {
		percentual = 10.00;
		reajuste = salario * percentual / 100;
	}
	else if (salario > 1200.00 && salario <= 2000.00) {
		percentual = 7.00;
		reajuste = salario * percentual / 100;
	}
	else {
		percentual = 4.00;
		reajuste = salario * percentual / 100;
	}

	printf("Novo salario: %.2lf\n",(salario+reajuste));
	printf("Reajuste ganho: %.2lf\n",reajuste);
	printf("Em percentual: %.0lf %%\n",percentual);

	return 0;
}
