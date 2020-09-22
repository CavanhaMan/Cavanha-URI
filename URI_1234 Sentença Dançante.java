/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1234      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		while (sc.hasNext()) {
			String dancaIN = sc.nextLine();
			char[] mod = dancaIN.toCharArray();
			String dancaOUT = "";
			boolean ok = true;

			for (int i=0 ; i<mod.length ; i++) 
				mod[i] = dancaIN.charAt(i);

			for (int i=0 ; i<mod.length ; i++) {
				if (mod[i] == ' ')
					continue;
				else if (ok) {
					mod[i] = Character.toUpperCase(mod[i]);
					ok = false;
				}
				else {
					mod[i] = Character.toLowerCase(mod[i]);
					ok = true;
				}
			}

			for (int i=0 ; i<mod.length ; i++) 
				dancaOUT += mod[i];

			System.out.println(dancaOUT);
		}
		sc.close();
	}
}