/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1016           |
| Distancia          |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double distancia,tempo;

		distancia = sc.nextDouble();
		
		// tempo = 150 / 60 * distancia;

		System.out.printf("%.0f minutos\n", distancia*2);
		
		sc.close();
	}
}