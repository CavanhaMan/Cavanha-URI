/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1043           |
| Triangulo          |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	float a,b,c,perimetro,area;

	scanf("%f",&a);
	scanf("%f",&b);
	scanf("%f",&c);

	perimetro = a + b + c;
	area = c*(a+b)/2;

	// � TRIANGULO - calcula perimetro
	if (b+c>a && a+b>c && a+c>b)
		printf("Perimetro = %.1f\n",perimetro);
	// N�O � TRIANGULO - calcula area
	else
		printf("Area = %.1f\n",area);
	return 0;
}
