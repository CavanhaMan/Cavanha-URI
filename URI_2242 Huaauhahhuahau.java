/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 2242      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		String risada = sc.next();
		String lol = "";
		
		for(int i=0 ; i<risada.length() ; i++)
			if (risada.charAt(i) == 'a' || risada.charAt(i) == 'e' || risada.charAt(i) == 'i' || risada.charAt(i) == 'o' || risada.charAt(i) == 'u')
				lol = lol + risada.charAt(i);
		
		String relol = new StringBuilder(lol).reverse().toString();
		
		if (lol.equals(relol))
			System.out.println("S");
		else
			System.out.println("N");
		
		sc.close();
	}

}
