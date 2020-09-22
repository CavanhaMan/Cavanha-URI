/*----------------------------*
| Rodrigo CavanhaMan          |
| URI 1959                    |
| Poligonos Regulares Simples |
*-----------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long l = sc.nextInt();
		System.out.println(n*l);
		
		sc.close();
	}
}