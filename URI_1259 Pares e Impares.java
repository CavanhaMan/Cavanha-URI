/*-------------------*
| Rodrigo CavanhaMan |
| URI 1259           |
| Pares e Impares    |
*--------------------*/
import java.util.Scanner;
//import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Iterator;
//import java.util.HashSet;
//import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));
		
		List<Integer> lista = new ArrayList<>();
		List<Integer> par 	= new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++)
			lista.add(sc.nextInt());
				
		for (Integer x: lista){
			if (x%2==0)
				par.add(x);
			else
				impar.add(x);
		}
		
		Collections.sort(par);
		Collections.sort(impar);
		Collections.reverse(impar);
		
		for (Integer y: par)
			System.out.println(y);
		for (Integer z: impar)
			System.out.println(z);
		
		sc.close();
	}
}
