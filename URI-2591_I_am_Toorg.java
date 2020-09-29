/*-------------------*
| Rodrigo CavanhaMan |
| URI 2591           |
| I am Toorg!        |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		String aux;
		int n = Integer.parseInt(sc.nextLine());
		for (int i=0 ; i<n ; i++)
			aux = sc.nextLine();
		
		for (int i=0 ; i<n ; i++)
			System.out.println("I am Toorg!");
		
		sc.close();
	}
}
