/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1060      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x = 1, conta = 0;
		float num;
		
		while (x <= 6) {
			num = sc.nextFloat();
			if (num > 0){
				conta = conta + 1;
			}
			x = x + 1;
		}
		System.out.printf("%d valores positivos\n",conta);
		sc.close();
	}
}