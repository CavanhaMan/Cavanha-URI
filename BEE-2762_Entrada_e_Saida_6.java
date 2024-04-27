/*-------------------*
| Rodrigo CavanhaMan |
| URI 2762           |
| Entrada e Saída 6  |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		String[] a = new String[2]; 
		a = sc.nextLine().split("\\.");
		System.out.printf("%s.%s\n",Integer.parseInt(a[1]),a[0]);
		sc.close();
	}
}