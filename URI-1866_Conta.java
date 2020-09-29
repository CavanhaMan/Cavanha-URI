/*-------------------*
| Rodrigo CavanhaMan |
| URI 1866           |
| Conta              |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i=0 ; i<c ; i++){
			int n = sc.nextInt();
				if(n%2==0)	System.out.println("0");
				else		System.out.println("1");
		}
		sc.close();
	}
}
