/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1020           |
| Idade em Dias      |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	int idade,ano,meses;
	scanf("%d",&idade);

	if (idade >= 365){
		ano = idade / 365;
		idade = idade % 365;
		printf("%d ano(s)\n", ano);
	}
	else{
		printf("0 ano(s)\n");
	}

	if (idade >= 30){
		meses = idade / 30;
		idade = idade % 30;
		printf("%d mes(es)\n", meses);
	}
	else{
		printf("0 mes(es)\n");
	}

	printf("%d dia(s)\n", idade);

	return 0;
}
