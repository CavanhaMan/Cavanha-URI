/*-------------------*
| Rodrigo CavanhaMan |
| URI 1008           |
| Salario            |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int num,hrtrab;
	double vrhora, salario;
	scanf("%d",&num);
	scanf("%d",&hrtrab);
	scanf("%lf",&vrhora);
	salario = hrtrab * vrhora;
	
	printf("NUMBER = %d\n",num);
	printf("SALARY = U$ %.2f\n",salario);
	
}
