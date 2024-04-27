/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1052           |
| Mes                |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
    int x, mesN[12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    char mes[12][10] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    scanf("%d", &x);

    for (int i=0; i<12; i++)
        if (x == mesN[i]) {
            printf("%s\n", mes[i]);
            return 0;
        }
}

