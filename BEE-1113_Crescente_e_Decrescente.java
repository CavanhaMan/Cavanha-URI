/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1113      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n, m, stop=1, aux, soma = 0;
		
		while (stop != 0){
			n = sc.nextInt();
			m = sc.nextInt();
			
			if (n == m){
				stop = 0;
			}
			else {
				stop = 1;
				if (n > m){
					System.out.println("Decrescente");
				}
				else {
				System.out.println("Crescente");
				}
			}
		}
		sc.close();
	}
}