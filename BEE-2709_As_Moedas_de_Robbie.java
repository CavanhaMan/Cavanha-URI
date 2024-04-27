/*--------------------*
| Rodrigo CavanhaMan  |
| BEE 2709            |
| As Moedas de Robbie |
*---------------------*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			int m = sc.nextInt(); //quantidade de moedas
			List<Integer> v = new ArrayList<Integer>();
			for(int x=0 ; x<m ; x++)
				 v.add(sc.nextInt()); //valor da moeda
			
			int n=sc.nextInt(); //salto das moedas que serao somadas
			int soma=0;
			
			Collections.reverse(v);

			for (int i=0 ; i<v.size() ; i+=n)
				soma+=v.get(i);
			
			if(soma!=1 && soma!=0 && ehprimo(soma))
				System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
			else
				System.out.println("Bad boy! I’ll hit you.");
		}
		sc.close();
	}

	private static boolean ehprimo(int soma) {
	    for (int j = 2; j < soma; j++) {
	        if (soma % j == 0)
	            return false;   
	    }
	    return true;
	}
}
