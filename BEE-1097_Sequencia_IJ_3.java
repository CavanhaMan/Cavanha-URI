/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1097      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i=1, j=7;
		
		while (i <= 9){
			System.out.printf("I=%d J=%d\n",i,j);
			System.out.printf("I=%d J=%d\n",i,j-1);
			System.out.printf("I=%d J=%d\n",i,j-2);
			i = i + 2;
			j = j + 2;
		}
		sc.close();
	}
}