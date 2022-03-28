/*--------------------------*
| Rodrigo CavanhaMan        |
| URI 1047                  |
| Tempo de Jogo com Minutos |
*---------------------------*/
#include<stdio.h>
#include <stdlib.h>     /* abs */
using namespace std;

int main() {

	int Hini,Mini,Hfim,Mfim,Tini,Tfim,duracaoh, duracaom;
	scanf("%d",&Hini);
	scanf("%d",&Mini);
	scanf("%d",&Hfim);
	scanf("%d",&Mfim);

	Tini = Mini + (Hini * 60);
	Tfim = Mfim + (Hfim * 60);

	if (Tini >= Tfim)
		duracaoh = ((1440 - Tini) + Tfim)/60;
	else
		duracaoh = (Tfim - Tini)/60;

	if (Mini > Mfim)
		duracaom = (60 - Mini) + Mfim;
	else
		duracaom = abs(Mfim - Mini);

	printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",duracaoh,duracaom);

	return 0;
}
