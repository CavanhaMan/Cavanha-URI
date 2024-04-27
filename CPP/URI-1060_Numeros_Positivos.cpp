/*-------------------*
| Rodrigo CavanhaMan |
| URI 1060           |
| Numeros Positivos  |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int x = 1, conta = 0;
	float num;
	
	while (x <= 6) {
		scanf("%f",&num);
		if (num > 0)
			conta++;
		x++;
	}
	printf("%d valores positivos\n",conta);
}
