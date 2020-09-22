/*-------------------*
| Rodrigo CavanhaMan |
| URI 1061           |
| Tempo de um Evento |
*--------------------*/
#include <stdio.h>

int main(int argc, char *argv[])
{
	printf("Hello, world\n");
	

		int Dini, Hini, Mini, Sfim;
		int Dfim, Hfim, Mfim, Sini;
		int Tini, Tfim, duracaoT;
		int Dtotal, Htotal, Mtotal, Stotal;
		String aux;
		
		// entrada inicio:
		aux = sc.next();
		Dini = sc.nextInt();
		Hini = sc.nextInt();
		aux = sc.next();
		Mini = sc.nextInt();
		aux = sc.next();
		Sini = sc.nextInt();
		
		// entrada fim
		aux = sc.next();
		Dfim = sc.nextInt();
		Hfim = sc.nextInt();
		aux = sc.next();
		Mfim = sc.nextInt();
		aux = sc.next();
		Sfim = sc.nextInt();

		// transformando dias, horas e minutos em segundos:
		Tini = Sini + (Mini * 60) + (Hini * 3600) + (Dini * 86400);
		Tfim = Sfim + (Mfim * 60) + (Hfim * 3600) + (Dfim * 86400);
		
		duracaoT = Tfim - Tini;

		// transformando de volta para dias, horas e minutos:
		Dtotal = duracaoT / 86400;
		duracaoT = duracaoT % 86400;
		Htotal = duracaoT / 3600;
		duracaoT = duracaoT % 3600;
		Mtotal = duracaoT / 60;
		Stotal = duracaoT % 60;

		printf("%d dia(s)\n",Dtotal);
		printf("%d horas(s)\n",Htotal);
		printf("%d minuto(s)\n",Mtotal);
		printf("%d segundo(s)\n",Stotal);

	return 0;
	
}