/*-------------------*
| Rodrigo CavanhaMan |
| URI 1789           |
| A Corrida de Lesma |
*--------------------*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int l = Integer.parseInt(sc.nextLine());
			
			List<Integer> lesma = new ArrayList<>();
			
			String[] ll = new String[l];
			String aux = sc.nextLine();
			ll = aux.split(" ");
			for(int i=0 ; i<l ; i++)
				lesma.add(Integer.parseInt(ll[i]));
			
			Collections.sort(lesma);
			Collections.reverse(lesma);
			//System.out.println(lesma);
			//Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
			if(lesma.get(0)>=20) System.out.println("3");
			//Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
			else if(lesma.get(0)<20 && lesma.get(0)>=10) System.out.println("2");
			//Nível 1: Se a velocidade é menor que 10 cm/h .
			else System.out.println("1");
		}
		sc.close();
	}
}