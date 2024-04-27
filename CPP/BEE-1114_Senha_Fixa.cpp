/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1114           |
| Senha Fixa         |
*--------------------*/
#include<stdio.h>
using namespace std;

int main()
{
	int lesenha = 0, senha = 2002;
	
	while (lesenha != senha) {
		scanf("%d",&lesenha);
		if (lesenha == senha)
			printf("Acesso Permitido\n");
		else
			printf("Senha Invalida\n");
	}

}
