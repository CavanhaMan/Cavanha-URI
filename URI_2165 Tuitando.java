/*-------------------*
| Rodrigo CavanhaMan |
| URI 2165           |
| Tuitando           |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		String twit = sc.nextLine();
		if (twit.length()<=140)
			System.out.println("TWEET");
		else
			System.out.println("MUTE");

		sc.close();
	}
}