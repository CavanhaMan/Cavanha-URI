/*-------------------*
| Rodrigo CavanhaMan |
| URI 1759           |
| Ho Ho Ho           |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		
		for (int i=0 ; i<N-1 ; i++)
			System.out.printf("Ho ");
		System.out.println("Ho!");
		
		sc.close();
	}
}