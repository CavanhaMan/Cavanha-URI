/*-------------------*
| Rodrigo CavanhaMan |
| URI 1963           |
| O  Filme           |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double res = ((b-a)*100)/a;
		System.out.printf("%.2f%%\n",res);
		
		sc.close();
	}
}