/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1042      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int a,b,c,aux1,aux2,aux3;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		aux1 = Math.min(a, Math.min(b, c));
		aux2 = Math.min(a, b);
		aux3 = Math.max(a, b);
		
		if (aux1 == a){
			aux2 = Math.min(b, c);
			aux3 = Math.max(b, c);
		}
		if (aux1 == b){
			aux2 = Math.min(a, c);
			aux3 = Math.max(a, c);
		}
		if (aux1 == c){
			aux2 = Math.min(a, b);
			aux3 = Math.max(a, b);
		}
		
		System.out.println(aux1);
		System.out.println(aux2);
		System.out.println(aux3);

		System.out.printf("\n");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}
}