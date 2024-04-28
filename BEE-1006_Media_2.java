/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1006      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double A,B,C, Media;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		Media = (A/10*2)+(B/10*3)+(C/10*5);
		System.out.printf("MEDIA = %.1f\n", Media);
		
		sc.close();
	}
}