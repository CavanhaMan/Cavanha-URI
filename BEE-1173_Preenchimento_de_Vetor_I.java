/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1173      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner scan = new Scanner(System.in);
		int[] w = new int[10];
		int primeiro = sc.nextInt();
		
		for (int aux = 0; aux < 10; aux++){
			w[aux] = primeiro;
			primeiro = primeiro * 2;
		}
		for (int i = 0; i < 10; i++)
			System.out.printf("N[%d] = %d\n",i,w[i]);

		sc.close();
	}
}