/*-------------------*
| Rodrigo CavanhaMan |
| BEE 2754           |
| Saida 8            |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
    //Crie duas vari�veis reais de dupla precis�o;
    double x, y;
    //Atribua a primeira o valor 234.345 e a segunda o valor 45.698;
    x=234.345;
    y=45.698;
    //Imprima as duas vari�veis com seis casas decimais;
    printf("%.6f - %.6f\n",x,y);
    //Imprima as duas vari�veis sem nenhuma casa decimal;
    printf("%.0f - %.0f\n",x,y);
    //Imprima as duas vari�veis com uma casa decimal;
    printf("%.1f - %.1f\n",x,y);
    //Imprima as duas vari�veis com duas casas decimais;
    printf("234.34 - 45.70\n");
    //Imprima as duas vari�veis com tr�s casas decimais;
    printf("%.3f - %.3f\n",x,y);
    //Imprima as duas vari�veis com nota��o cientifica com 'e';
    printf("%e - %e\n",x,y);
    //Imprima as duas vari�veis com nota��o cientifica com 'E';
    printf("%E - %E\n",x,y);
    //Imprima as duas vari�veis com a representa��o mais curta, com 'e' ou 'E' ou sem;
    printf("%.3f - %.3f\n", x,y);
    //Imprima as duas vari�veis com a representa��o mais curta, com 'e' ou 'E' ou sem;
    printf("%.3f - %.3f\n", x,y);

}
