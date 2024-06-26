/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1143      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n;
		float aux=1;
		
		n = sc.nextInt();
		
		while (n > 0){
			System.out.printf("%.0f %.0f %.0f\n",aux,Math.pow(aux,2),Math.pow(aux,3));
			aux = aux + 1;
			n = n - 1;
		}
		sc.close();
	}
}