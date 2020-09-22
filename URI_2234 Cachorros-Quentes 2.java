/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2234            |
| Cachorros-Quentes 2 |
*---------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double hotdog = sc.nextDouble();
		double pessoas = sc.nextDouble();
		
		double res = hotdog/pessoas;
		
		System.out.printf("%.2f\n",res);
		
		sc.close();
	}
	
}	