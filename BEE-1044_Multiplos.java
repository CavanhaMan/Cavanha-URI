/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1044      |
+--------------------+
*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();

		if ((a%b==0) || (b%a == 0)){
			System.out.println("Sao Multiplos");
		}
		else{
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}
}