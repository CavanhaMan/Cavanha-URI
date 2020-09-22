/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1984      |
+--------------------+
*/
//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));
		
		String s = sc.nextLine();
		String invertida = new StringBuilder(s).reverse().toString();
		System.out.println(invertida);
		
		sc.close();
	}
}	