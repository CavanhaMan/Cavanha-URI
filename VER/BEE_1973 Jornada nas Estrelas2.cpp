#include <stdio.h>
int main()
{
    long long int N, i;
    scanf("%lld", &N);
    long long int star[N], sheep[N];
    long long int sum_trak=0, sum_sheep=0;
    for(i=0; i<N; i++){
        scanf("%lld", &sheep[i]);
        star[i]=0;
    }
    i=0;
    while(1){
        if(i==0 && carneiros[i]%2==0){ //par
            sitio[i]=1;
            if(carneiros[i]>0)	carneiros[i]--;
            break;
        }
        else if(i==N-1 && carneiros[i]%2==1){ //impar
            sitio[i]=1;
            if(carneiros[i]>0)	carneiros[i]--;
            break;
        }
        else if(carneiros[i]%2==1){ //impar
            carneiros[i]--;
            sitio[i]=1;
            i++;
        }
        else if(carneiros[i]%2==0){ //par
            sitio[i]=1;
            if(carneiros[i]>0)	carneiros[i]--;
            i--;
        }


    }
    for(i=0; i<N; i++){
        sum_sheep += carneiros[i];
        sum_trak += sitio[i];
    }
    printf("%lld %lld\n", sum_trak, sum_sheep);
    return 0;
}
