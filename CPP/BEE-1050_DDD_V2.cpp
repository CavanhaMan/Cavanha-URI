/*-------------------*
| Rodrigo CavanhaMan |
| URI 1050           |
| DDD                |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
    int x, ddd[8] = {61, 71, 11, 21, 32, 19, 27, 31};
    char cidade[8][15] = {"Brasilia","Salvador","Sao Paulo","Rio de Janeiro","Juiz de Fora","Campinas","Vitoria","Belo Horizonte"};

    scanf("%d", &x);

    for (int i=0; i<8; i++)
        if (x == ddd[i]) {
            printf("%s\n", cidade[i]);
            return 0;
        }
    printf("DDD nao cadastrado\n");
    return 0;
}

