/*-------------------*
| Rodrigo CavanhaMan |
| URI 1865           |
| Mjölnir            |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		int c = Integer.parseInt(sc.nextLine());
		for(int i=0 ; i<c ; i++){
			String nome = sc.next();
			int n = Integer.parseInt(sc.next());
			if(nome.equals("Thor"))
				System.out.println("Y");
			else
				System.out.println("N");
		}
		sc.close();
	}
}
