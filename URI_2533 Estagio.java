/*-------------------*
| Rodrigo CavanhaMan |
| URI 2533           |
| Estagio            |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		while(sc.hasNext()){
			double notas=0.0;
			double cargas=0.0;
			double somatoria=0.0;
			double somacargas=0.0;
			
			int n = sc.nextInt();
			for (int i=0 ; i<n ; i++){
				notas = sc.nextDouble();
				cargas = sc.nextDouble();
				somatoria += notas * cargas;
				somacargas += cargas;
			}
			double res = somatoria/(somacargas*100.00);
			System.out.printf("%.4f\n", res);
		}
		sc.close();
	}
}