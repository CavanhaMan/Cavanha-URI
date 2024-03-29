/*-------------------*
| Rodrigo CavanhaMan |
| URI 1074           |
| Par ou Impar       |
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
			if (x == 0)
				System.out.println("NULL");
			else {
				if (x % 2 == 0) {
					System.out.printf("EVEN");
					if (x < 0)
						System.out.println(" NEGATIVE");
					else 
						System.out.println(" POSITIVE");
				}
				else if (x % 2 != 0){
					System.out.printf("ODD");
					if (x < 0)
						System.out.println(" NEGATIVE");
					else 
						System.out.println(" POSITIVE");
				}
			}
			n = n - 1;
		}
		sc.close();
	}
}