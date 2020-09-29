/*-------------------*
| Rodrigo CavanhaMan |
| URI 2543           |
| Jogatina           |
*--------------------*/
//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));

		while(sc.hasNext()){
			
			int n = sc.nextInt();
			int facul = sc.nextInt();
			int entraf = 0;
			int game = 0;
			int contacs = 0;
			
			for (int i=0 ; i<n ; i++){
				entraf = sc.nextInt();
				game = sc.nextInt();
				if (entraf==facul)
					if (game==0)
						contacs++;
			}
			System.out.println(contacs);
		}
		sc.close();
	}
}