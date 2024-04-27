/*-------------------*
| Rodrigo CavanhaMan |
| URI 2523           |
| A Mensagem de Will |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String frase = sc.nextLine();
			char fraseChar[] = frase.toCharArray();
			
			int size = Integer.parseInt(sc.nextLine());
			String[] ltr = new String[size];
			int[] letras = new int[size];
			String aux = sc.nextLine();
			ltr = aux.split(" ");
			for(int i=0 ; i<size ; i++)
				letras[i] = Integer.parseInt(ltr[i])-1;
			
			for(int i=0 ; i<size ; i++)
				System.out.printf("%s",fraseChar[letras[i]]);
			System.out.println();
		}
		sc.close();
	}

}
