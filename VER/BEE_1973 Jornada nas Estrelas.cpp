#include <stdio.h>

int main(){
	long long int N, i;
	scanf("%lld", &N);
	long long int carneiros[N],sitio[N];
	long long int ataques=0,num_carneiros=0;
	for(i=0;i<N;i++){
		scanf("%lld", &carneiros[i]);
		sitio[i] = 0;
	}
	i =0;
	while(carneiros[i] != 0 && i != N){
		if(carneiros[i]%2!=0){
			sitio[i] = 1;
			carneiros[i]--;
			i++;
		}
		else{
			sitio[i] = 1;
			carneiros[i]--;
			i--;
		}
	}
	for(i=0;i<N;i++){
		num_carneiros += carneiros[i];
		ataques += sitio[i];
	}
	printf("%lld %lld\n", ataques, num_carneiros);
	return 0;
}