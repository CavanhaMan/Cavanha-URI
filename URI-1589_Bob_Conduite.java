/*-------------------*
| Rodrigo CavanhaMan |
| URI 1589           |
| Bob Conduite       |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0 ; i<t ; i++){
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			System.out.println(r1+r2);
		}
		sc.close();
	}
}