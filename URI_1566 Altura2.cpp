/*-------------------*
| Rodrigo CavanhaMan |
| URI 1566           |
| Altura 2           |
*--------------------*/
#include <iostream>
#include<stdio.h>
#include<algorithm>
using namespace std;

int main()
{
		int NC, N, i;
		int h[3000000]={0};
		 
		scanf("%d",&NC);
		
		while(NC--){
		
			scanf("%d",&N);

			for (i=0 ; i<N ; i++)
				scanf("%d",&h[i]);

			sort(h,h+N);

			for(i=0 ; i<N-1 ; i++)
				printf("%d ",h[i]);
			printf("%d\n",h[N-1]);

		}
		return 0;
}