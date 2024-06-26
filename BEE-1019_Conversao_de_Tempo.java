/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1019      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n,hora,min;
		n = sc.nextInt();
		
		if (n >= 3600){
			hora = n / 3600;
			n = n % 3600;
			System.out.printf("%d:", hora);
		}
		else{
			System.out.printf("0:");
		}
		
		if (n >= 60){
			min = n / 60;
			n = n % 60;
			System.out.printf("%d:", min);
		}
		else{
			System.out.printf("0:");
		}
		
		System.out.printf("%d\n", n);


		sc.close();
	}
}