/*----------------------------*
| Rodrigo CavanhaMan          |
| URI 2765                    |
| Entrada e Saída com Virgula |
*-----------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//DD/MM/AA
		String[] a = new String[4]; 
		a = sc.nextLine().split(",");
		System.out.printf("%s\n%s\n",a[0],a[1]);
		sc.close();
	}
}