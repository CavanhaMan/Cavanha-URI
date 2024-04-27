/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1046           |
| Tempo de Jogo      |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	int hini,hfim,duracao;
	scanf("%d",&hini);
	scanf("%d",&hfim);

	if (hini >= hfim)
		duracao = (24 - hini) + hfim;
	else
		duracao = hfim - hini;

	printf("O JOGO DUROU %d HORA(S)\n",duracao);

	return 0;
}
