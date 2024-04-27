/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1007           |
| Diferenca          |
*--------------------*/
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int A,B,C,D, DIFERENCA;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		DIFERENCA = (A*B)-(C*D);
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	}
}