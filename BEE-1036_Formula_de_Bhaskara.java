/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1036      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double a, b, c, delta,bhaskara1,bhaskara2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = ((b*b) - (4*a*c));
		
		if (delta < 0 || a == 0){
			System.out.printf("Impossivel calcular\n");	
		}
		else{
			bhaskara1 = ((b*-1) + Math.sqrt(delta))/(2*a);
			bhaskara2 = ((b*-1) - Math.sqrt(delta))/(2*a);

			System.out.printf("R1 = %.5f\n",bhaskara1);	
			System.out.printf("R2 = %.5f\n",bhaskara2);	
		}

		sc.close();
	}
}