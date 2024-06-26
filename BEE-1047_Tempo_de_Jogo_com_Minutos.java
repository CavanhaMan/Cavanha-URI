/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1047      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int Hini,Mini,Hfim,Mfim,Tini,Tfim,duracaoh, duracaom;
		Hini = sc.nextInt();
		Mini = sc.nextInt();
		Hfim = sc.nextInt();
		Mfim = sc.nextInt();

		Tini = Mini + (Hini * 60);
		Tfim = Mfim + (Hfim * 60);
		
		if (Tini >= Tfim){
			duracaoh = ((1440 - Tini) + Tfim)/60;
		}
		else {
			duracaoh = (Tfim - Tini)/60;
		}
		
		if (Mini > Mfim){
			duracaom = (60 - Mini) + Mfim;
		}
		else {
			duracaom = Math.abs(Mfim - Mini);
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",duracaoh,duracaom);

		sc.close();
	}
}