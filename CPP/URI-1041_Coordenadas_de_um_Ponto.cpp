/*------------------------*
| Rodrigo CavanhaMan      |
| URI 1041                |
| Coordenadas de um Ponto |
*-------------------------*/
#include<stdio.h>
using namespace std;

int main() {

	float x,y;
	scanf("%f",&x);
	scanf("%f",&y);

	if (x == 0 && y == 0)
		printf("Origem\n");
	else if(x == 0)
		printf("Eixo Y\n");
	else if(y == 0)
		printf("Eixo X\n");
	else{
		if (x > 0 && y > 0)
			printf("Q1\n");
		if (x < 0 && y > 0)
			printf("Q2\n");
		if (x < 0 && y < 0)
			printf("Q3\n");
		if (x > 0 && y < 0)
			printf("Q4\n");
	}
	return 0;
}
