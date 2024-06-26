/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1017      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double tempo,velocidade,distancia,consumo;

		tempo = sc.nextDouble();
		velocidade = sc.nextDouble();
		
		distancia = tempo * velocidade;
		consumo = distancia / 12;

		System.out.printf("%.3f\n", consumo);
		
		sc.close();
	}
}