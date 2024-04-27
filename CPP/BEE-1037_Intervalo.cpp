/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1037           |
| Intervalo          |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	double x;
	scanf("%lf",&x);

	if ((x >= 0) && (x <= 25))
		printf("Intervalo [0,25]\n");
	else if ((x > 25) && (x <= 50))
		printf("Intervalo (25,50]\n");
	else if ((x > 50) && (x <= 75))
		printf("Intervalo (50,75]\n");
	else if ((x > 75) && (x <= 100))
		printf("Intervalo (75,100]\n");
	else
		printf("Fora de intervalo\n");

	return 0;
}
