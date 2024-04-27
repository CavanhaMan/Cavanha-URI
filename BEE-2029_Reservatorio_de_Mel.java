/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2029            |
| Reservatorio de Mel |
*---------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double pi = 3.14;
		double volume, raio, altura, diametro, area;
		
		while (sc.hasNext()){
			volume = sc.nextDouble();
			diametro = sc.nextDouble();
			
			raio = diametro/2;
			area = pi*raio*raio;
			altura = volume/area;
			
			System.out.printf("ALTURA = %.2f\n", altura);
			System.out.printf("AREA = %.2f\n", area);
		}

		sc.close();
	}
}	