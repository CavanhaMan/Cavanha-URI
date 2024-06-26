/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1075      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n, conta=1;
		
		n = sc.nextInt();

		while (conta < 10000) {
			if (conta % n == 2){
				System.out.println(conta);
			}
			conta = conta + 1;
		}

		sc.close();
	}
}