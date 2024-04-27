/*-------------------*
| Rodrigo CavanhaMan |
| URI 1930           |
| Tomadas            |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt()-1;
	    int b = sc.nextInt()-1;
	    int c = sc.nextInt()-1;
	    int d = sc.nextInt();
	    System.out.println(a+b+c+d);
		sc.close();
	}
}