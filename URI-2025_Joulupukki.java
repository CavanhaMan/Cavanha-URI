package projeto01;
/*-------------------*
| Rodrigo CavanhaMan |
| URI 2025           |
| Joulupukki         |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n = Integer.parseInt(sc.nextLine());
		for (int i=0; i<n; i++){
			String carta = sc.nextLine();
			System.out.println(carta.replaceAll("\\woulupukk\\w", "Joulupukki"));
		}
		//Joulupukki
		//?oulupukki
		//Joulupukk?
		//?oulupukk?
		//if (carta.indexOf ("oulupukk") >= 0)
		//    System.out.println ("ok");
		
		//if (carta.contains("oulupukk")) System.out.println("Contém");
		//else System.out.println("Não contém");
		//
		//\\w
		sc.close();
	}
}
