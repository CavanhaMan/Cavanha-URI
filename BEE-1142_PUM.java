/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1142      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n, aux=1;
		
		n = sc.nextInt();
		
		while (n > 0){
			System.out.printf("%d %d %d PUM\n",aux,aux+1,aux+2);
			aux = aux + 4;
			n = n - 1;
		}
		sc.close();
	}
}