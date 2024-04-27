/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1078           |
| Tabuada            |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
 	int x, n;
 	scanf("%d", &n);
 	for(x=1 ; x<=10 ; x++)
 		printf("%d x %d = %d\n", x, n, x*n);
 	return 0;
}
