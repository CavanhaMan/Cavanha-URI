/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1073      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double aux = 1, n;
		
		n = sc.nextInt();
		
		while (aux <= n) {
			if (aux % 2 == 0) {
				System.out.printf("%.0f^2 = %.0f\n",aux,Math.pow(aux,2));
			}
			aux = aux + 1;
		}
		
		sc.close();
	}
}