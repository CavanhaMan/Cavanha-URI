/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1095      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i=1, j=60;
		
		while (j >= 0){
			System.out.printf("I=%d J=%d\n",i,j);
			i = i + 3;
			j = j - 5;
		}
		sc.close();
	}
}