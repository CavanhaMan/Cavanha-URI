/*-------------------*
| Rodrigo CavanhaMan |
| URI 2166           |
| Raiz Quadrada de 2 |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n = sc.nextInt();
		double raiz = 0.0;
		
		for (int i=0 ; i<n ; i++){
			raiz += 2.0;
			raiz = 1.0/raiz;
		}
		raiz += 1.0;
		System.out.printf("%.10f\n",raiz);

		sc.close();
	}
}