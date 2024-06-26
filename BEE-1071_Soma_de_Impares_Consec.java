/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1071      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x, y, aux1=0, aux2=0, somaimpar = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x == y) {
			System.out.println("0");
		}
		else if (x < y){
			aux1 = x+1;
			aux2 = y;
		}
		else {
			aux1 = y+1;
			aux2 = x;
		}
		
			while (aux1 < aux2) {
				if (aux1 %2 != 0) {
					somaimpar = somaimpar + aux1;
					//System.out.println(aux1);
				}
				aux1 = aux1 + 1;
			}
		
			System.out.println(somaimpar);
		
		sc.close();
	}
}