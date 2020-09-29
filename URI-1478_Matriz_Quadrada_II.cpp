/*-------------------*
| Rodrigo CavanhaMan |
| URI 1478           |
| Matriz Quadrada II |
*--------------------*/

#include <stdio.h>
#include <iostream>
 
using namespace std;
int main()
{
		int L, C, N=0;
		scanf("%d", &N);
		
		while (N != 0){
			for(L=1 ; L<=N ; L++){
				printf("%3d",L);
				for(C=L-1 ; C>=1 ; C--)
					printf(" %3d",C);
				for(C=2 ; C<=N-L+1 ; C++)
					printf(" %3d",C);
				printf("\n");
			}
			printf("\n");
			scanf("%d", &N);
		}
	return 0;
}
