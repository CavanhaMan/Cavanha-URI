/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 2028               |
| Sequencia de sequencia |
*------------------------*/
#include<stdio.h>

int main(){

	int n, conta=0;
	while(scanf("%d", &n) != EOF){
		if (n>=0 && n<=200){
		    int num = 1;
		    conta++;
		    num += n*(n+1)/2;
		    if (n == 0)
		        printf("Caso %d: %d numero\n", conta, num);
		    else 
		       	printf("Caso %d: %d numeros\n", conta, num);
		        
		    printf("0");
		        
		    for (int i=1; i<=n; i++)
		        for(int j=1; j<=i; j++)
		    	   	printf(" %d", i);
		        
		    printf("\n\n");
		    }
	    }
}	
