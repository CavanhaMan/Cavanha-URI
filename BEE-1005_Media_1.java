/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1005      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double A,B, Media;
		A = sc.nextDouble();
		B = sc.nextDouble();
		Media = ((A*3.5)+(B*7.5))/11;
		System.out.printf("MEDIA = %.5f\n", Media);
		
		sc.close();
	}
}

