/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 1921               |
| Guilherme e Suas Pipas |
*------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
	
		long n = sc.nextInt();
		long tam  = (n*(n-3)/2);
		//diag = (l*(l-3))/2;
		System.out.println(tam);
		sc.close();
	}
}