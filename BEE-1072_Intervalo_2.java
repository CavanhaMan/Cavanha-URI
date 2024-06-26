/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1072      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n, x, somain = 0, somaout = 0;
		
		n = sc.nextInt();
		
		while (n > 0) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				somain = somain + 1;
			}
			else {
				somaout = somaout + 1;
			}
			n = n - 1;
		}
		
		System.out.printf("%d in\n",somain);
		System.out.printf("%d out\n",somaout);
		
		sc.close();
	}
}