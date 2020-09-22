/*-------------------*
| Rodrigo CavanhaMan |
| URI 2334           |
| Patinho            |
*--------------------*/
#include <stdio.h>
using namespace std;
int main(){
	unsigned long long int p;
	while(scanf("%llu", &p)){
		if(p == -1ll) break;
        if(p == 0ll) printf("0\n");
		else printf("%llu\n",p-1ll);
		;
	}
	return 0;
}
//10000000000000000000
//8999999999999999999