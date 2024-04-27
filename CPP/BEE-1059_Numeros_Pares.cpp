/*-------------------*
| Rodrigo CavanhaMan |
| URI 1059           |
| Numeros Pares      |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int num = 1;
	
	while (num <= 100) {
		if (num%2==0)
			printf("%d\n",num);
		num++;
	}

}
