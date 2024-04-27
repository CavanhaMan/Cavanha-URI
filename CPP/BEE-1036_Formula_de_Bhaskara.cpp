/*--------------------*
| Rodrigo CavanhaMan  |
| BEE 1036            |
| Formula de Bhaskara |
*---------------------*/
#include<stdio.h>
#include<math.h>
using namespace std;

int main() {
	double a, b, c, delta,bhaskara1,bhaskara2;
	scanf("%lf",&a);
	scanf("%lf",&b);
	scanf("%lf",&c);

	delta = ((b*b) - (4*a*c));

	if (delta < 0 || a == 0)
		printf("Impossivel calcular\n");	
	else{
		bhaskara1 = ((b*-1) + sqrt(delta))/(2*a);
		bhaskara2 = ((b*-1) - sqrt(delta))/(2*a);
		printf("R1 = %.5lf\n",bhaskara1);	
		printf("R2 = %.5lf\n",bhaskara2);	
	}
	return 0;
}
