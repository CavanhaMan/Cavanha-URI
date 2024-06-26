/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1051      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double renda, aux;

		renda = sc.nextDouble();
		
		if (renda >= 0.00 && renda <= 2000.00) {
			System.out.println("Isento");
		}
		else if (renda > 2000.00 && renda <= 3000.00) {
			System.out.printf("R$ %.2f\n",(renda-2000)*8/100);
		}
		else if (renda > 3000.00 && renda <= 4500.00) {
			aux = (1000*8/100) + ((renda-3000)*18/100);
			System.out.printf("R$ %.2f\n",aux);
		}
		else {
			aux = (1000*8/100) + (1500*18/100) + ((renda-4500)*28/100);
			System.out.printf("R$ %.2f\n",aux);
		}

		sc.close();
	}
}