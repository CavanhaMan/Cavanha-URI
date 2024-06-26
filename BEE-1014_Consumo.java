/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1014      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int distancia;
		double combustivel, consumo;

		distancia = sc.nextInt();
		combustivel = sc.nextDouble();

		consumo = distancia / combustivel;
		
		System.out.printf("%.3f km/l\n", consumo);
		
		sc.close();
	}
}