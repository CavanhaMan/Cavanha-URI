/*-------------------*
| Rodrigo CavanhaMan |
| URI 1067           |
| Numeros Impares    |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x, aux = 1;
		
		x = sc.nextInt();

		while (aux <= x) {
			if (aux % 2!= 0)
				System.out.println(aux);
			aux = aux + 1;
		}
		sc.close();
	}
}