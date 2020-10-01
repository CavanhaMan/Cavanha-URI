/*-------------------*
| Rodrigo CavanhaMan |
| URI 1238           |
| Combinador         |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i=0 ; i<N ; i++) {
			String[] entrada = sc.nextLine().split(" ");
			char[] fr1 = entrada[0].toCharArray();
			char[] fr2 = entrada[1].toCharArray();
			String saida = "";
			
			for (int z=0 ; z<(fr1.length+fr2.length) ; z++) {
				if (z<fr1.length)
					saida+=fr1[z];
				if (z<fr2.length)
					saida+=fr2[z];
			}
			System.out.println(saida);
		}		
		sc.close();
	}
}
