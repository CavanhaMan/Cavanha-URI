/*-------------------*
| Rodrigo CavanhaMan |
| URI 2534           |
| Exame Geral        |
*--------------------*/
//import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));

		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] ns = new int[n];
			int[] saida = new int[q];
			List<Integer> lista = new ArrayList<Integer>();
			
			for(int i=0 ; i<n ; i++)
				lista.add(sc.nextInt());
			
			Collections.sort(lista);
			//System.out.println(lista);
			Collections.reverse(lista);
			//System.out.println(lista);
			
			for(int i=0 ; i<q ; i++)
				saida[i] = sc.nextInt();
			
			for(int i=0 ; i<q ; i++)
				System.out.println(lista.get(saida[i]-1));
		}
		sc.close();
	}
}