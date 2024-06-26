/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1011      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double volume, raio, pi = (3.14159);
		raio = sc.nextDouble();
		raio = Math.pow(raio,3.0);
		volume = (4/3.0)*pi*raio;
		
		System.out.printf("VOLUME = %.3f\n", volume);
		
		sc.close();
	}

}

