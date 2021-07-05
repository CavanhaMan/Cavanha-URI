/*-------------------*
| Rodrigo CavanhaMan |
| URI 2718           |
| Luzes de Natal     |
*--------------------*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//int n = sc.nextInt(); //quantidade de grupos
		int x = sc.nextInt();
		//int div=1;
		ArrayList<Integer> binario = new ArrayList<Integer>();
		int resto;
		while(x!=0) {
			resto=x%2;
			System.out.println("r: "+resto);
			x/=2;
			System.out.println("x: "+x);
			binario.add(resto);
		}
		Collections.reverse(binario);
		for (int w : binario) System.out.print(w);
				
		sc.close();
	}
}
/*
dividir o pisca pisca em grupos ordenados de 50 lâmpadas
e em cada grupo só consertar a maior quantidade de lâmpadas consecutivas queimadas.

3 x 50

11 = 1011 = 2

7 = 111 = 3

23 = 10111 = 3

*/