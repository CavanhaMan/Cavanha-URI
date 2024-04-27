/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1018           |
| Cedulas            |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	int grana;
	scanf("%d",&grana);

	printf("%d\n",grana);
	
	printf("%d nota(s) de R$ 100,00\n", grana/100);
	grana = grana % 100;

	printf("%d nota(s) de R$ 50,00\n", grana/50);
	grana = grana % 50;

	printf("%d nota(s) de R$ 20,00\n", grana/20);
	grana = grana % 20;

	printf("%d nota(s) de R$ 10,00\n", grana/10);
	grana = grana % 10;

	printf("%d nota(s) de R$ 5,00\n", grana/5);
	grana = grana % 5;

	printf("%d nota(s) de R$ 2,00\n", grana/2);
	grana = grana % 2;

	printf("%d nota(s) de R$ 1,00\n", grana/1);
	grana = grana % 1;

	return 0;
}
