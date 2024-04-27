/*-------------------*
| Rodrigo CavanhaMan |
| URI 1157           |
| Divisores 1        |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int n;
	scanf("%d",&n);
	for (int aux=1; aux<=n; aux++)
		if (n%aux==0)
			printf("%d\n",aux);
}
