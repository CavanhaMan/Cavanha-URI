/*-------------------*
| Rodrigo CavanhaMan |
| URI 2754           |
| Saida8             |
*--------------------*/
#include <iostream>
//#include <stdio.h>
#include <string>
using namespace std;
int main(){
    double x = 234.345;
	double y =  45.698;
    printf("%.6f - %.6f\n",x,y);//3
    printf("%.0f - %.0f\n",x,y);//4
    printf("%.1f - %.1f\n",x,y);//5
    printf("%.2f - %.2f\n",x,y);//6
    printf("%.3f - %.3f\n",x,y);//7
    printf("%.6e - %.6e\n",x,y);//8
    printf("%.6E - %.6E\n",x,y);//9
    printf("%.3f - %.3f\n",x,y);//10
    printf("%.3f - %.3f\n",x,y);//11
}
