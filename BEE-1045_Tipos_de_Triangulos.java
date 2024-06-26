/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1045      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		float a,b,c,temp;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

	    if (a < b) {
	        temp = a;
	        a = b;
	        b = temp;
	    }
	    if (b < c) {
	        temp = b;
	        b = c;
	        c = temp;
	    }
	    if (a < b) {
	        temp = a;
	        a = b;
	        b = temp;
	    }

		if (a >= (b+c)){
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if ((a*a) == (b*b+c*c)){
			System.out.println("TRIANGULO RETANGULO");
		}
		else if ((a*a) > (b*b+c*c)){
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if ((a*a) < (b*b+c*c)){
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && b == c){
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if (a == b || b == c){
			System.out.println("TRIANGULO ISOSCELES");
		}

		sc.close();
	}
}