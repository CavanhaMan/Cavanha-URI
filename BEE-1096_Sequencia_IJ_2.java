/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1096      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i=1;
		
		while (i <= 9){
			System.out.printf("I=%d J=7\n",i);
			System.out.printf("I=%d J=6\n",i);
			System.out.printf("I=%d J=5\n",i);
			i = i + 2;
		}
		sc.close();
	}
}