/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1116      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n;
		double x, y;
		
		n = sc.nextInt();
		
		while (n > 0){
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if (y == 0){
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.1f\n",x/y);
			}
			n = n - 1;
		}
		sc.close();
	}
}