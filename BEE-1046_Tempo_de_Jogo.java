/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1046      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int hini,hfim,duracao;
		hini = sc.nextInt();
		hfim = sc.nextInt();

		if (hini >= hfim){
			duracao = (24 - hini) + hfim;
		}
		else {
			duracao = hfim - hini;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n",duracao);

		sc.close();
	}
}