/*-------------------*
| Rodrigo CavanhaMan |
| URI 1011           |
| Esfera             |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	double volume, raio, pi = (3.14159);
	scanf("%lf",&raio);
	volume = (4/3.0)*pi*raio*raio*raio;
	printf("VOLUME = %.3lf\n", volume);
}

