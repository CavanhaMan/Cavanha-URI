/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1012           |
| Area               |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	double a,b,c, areatri,areacirc,areatrap,areaquad,arearet,pi = (3.14159);
	scanf("%lf",&a);
	scanf("%lf",&b);
	scanf("%lf",&c);
	//a) area do triangulo retangulo
	areatri = a * c / 2.0;
	//b) area do circulo
	areacirc = pi * c * c;
	//c) area do trapezio
	areatrap = c * (a + b) / 2;
	//d) area do quadrado
	areaquad = b * b;
	//e) area do retangulo
	arearet = a * b;

	printf("TRIANGULO: %.3lf\n", areatri);
	printf("CIRCULO: %.3lf\n", areacirc);
	printf("TRAPEZIO: %.3lf\n", areatrap);
	printf("QUADRADO: %.3lf\n", areaquad);
	printf("RETANGULO: %.3lf\n", arearet);
}

