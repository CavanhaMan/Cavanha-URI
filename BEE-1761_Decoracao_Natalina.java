/*-------------------*
| Rodrigo CavanhaMan |
| URI 1761           |
| Decoracao Natalina |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double pi = 3.141592654;
			
			//double h = b * tg(a) + c;
			double h = b * Math.tan(a*pi/180.0) + c;
	
			System.out.printf("%.2f\n",h*5.0);
		}
		sc.close();
	}
}