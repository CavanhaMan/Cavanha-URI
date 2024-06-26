/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1061      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
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

		if (duracaoT >= 60){
			// transformando de volta para dias, horas e minutos:
			Dtotal = duracaoT / 86400;
			duracaoT = duracaoT % 86400;
			Htotal = duracaoT / 3600;
			duracaoT = duracaoT % 3600;
			Mtotal = duracaoT / 60;
			Stotal = duracaoT % 60;
	
			System.out.println(Dtotal + " dia(s)");
			System.out.println(Htotal + " hora(s)");
			System.out.println(Mtotal + " minuto(s)");
			System.out.println(Stotal + " segundo(s)");
		}
		sc.close();
	}
}