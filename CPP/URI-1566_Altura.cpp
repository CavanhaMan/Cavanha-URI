/*-------------------*
| Rodrigo CavanhaMan |
| URI 1566           |
| Altura             |
*--------------------*/
#include<iostream>
#include<stdio.h>
#include<algorithm>
using namespace std;

int main()
{
    int array[3000000]={0};
        int tc,n;
        int i;

        scanf("%d",&tc);

            while(tc--){

            scanf("%d",&n);

            for(int j=0;j<n;j++){
            scanf("%d",&array[j]);
            }

        sort(array,array+n);

        for(i=0;i<n-1;i++)
            printf("%d ",array[i]);

            printf("%d",array[n-1]);
           printf("\n");
}
    return 0;
}