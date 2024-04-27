/*-------------------*
| Rodrigo CavanhaMan |
| BEE 2754           |
| Saida 8            |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
    //Crie duas variáveis reais de dupla precisão;
    double x, y;
    //Atribua a primeira o valor 234.345 e a segunda o valor 45.698;
    x=234.345;
    y=45.698;
    //Imprima as duas variáveis com seis casas decimais;
    printf("%.6f - %.6f\n",x,y);
    //Imprima as duas variáveis sem nenhuma casa decimal;
    printf("%.0f - %.0f\n",x,y);
    //Imprima as duas variáveis com uma casa decimal;
    printf("%.1f - %.1f\n",x,y);
    //Imprima as duas variáveis com duas casas decimais;
    printf("234.34 - 45.70\n");
    //Imprima as duas variáveis com três casas decimais;
    printf("%.3f - %.3f\n",x,y);
    //Imprima as duas variáveis com notação cientifica com 'e';
    printf("%e - %e\n",x,y);
    //Imprima as duas variáveis com notação cientifica com 'E';
    printf("%E - %E\n",x,y);
    //Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
    printf("%.3f - %.3f\n", x,y);
    //Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
    printf("%.3f - %.3f\n", x,y);

}
