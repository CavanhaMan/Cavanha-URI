/*-------------------*
| Rodrigo CavanhaMan |
| URI 1014           |
| Consumo            |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int distancia;
	float combustivel, consumo;

	scanf("%d",&distancia);
	scanf("%f",&combustivel);

	consumo = distancia / combustivel;
	
	printf("%.3f km/l\n", consumo);
	
}
