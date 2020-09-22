/*-------------------*
| Rodrigo CavanhaMan |
| URI 1435           |
| Matriz Quadrada I  |
*--------------------*/
#include <stdio.h>
#include <iostream>
 
using namespace std;
int main()
{
		//MATRIZ[L][C]
		int min=1, L, C, N=0;

		scanf("%d", &N);
		
		int MATRIX[N+1][N+1];
		
		// i, j, N-i+1, N-j+1
		while (N != 0){
			for(L=1 ; L<=N ; L++)
				for(C=1 ; C<=N ; C++){
					min = L;
					if (C < min)
						min = C;
					if (N-L+1 < min)
						min = N-L+1;
					if (N-C+1 < min)
						min = N-C+1;
					//MATRIX[L][C] = min;
					printf("%3d",min);
					if (C<N)
						printf(" ");
					else 
						printf("\n");
				}

			printf("\n");
			scanf("%d", &N);
			min = 1; L=1; C=1;
		}
	return 0;
}