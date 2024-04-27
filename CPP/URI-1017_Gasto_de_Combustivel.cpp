/*---------------------*
| Rodrigo CavanhaMan   |
| BEE 1017             |
| Gasto de Combustivel |
*----------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	float tempo,velocidade,distancia,consumo;
	scanf("%f",&tempo);
	scanf("%f",&velocidade);
	
	distancia = tempo * velocidade;
	consumo = distancia / 12;

	printf("%.3f\n", consumo);
}
