/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1012      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double a,b,c, areatri,areacirc,areatrap,areaquad,arearet,pi = (3.14159);

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

	//a) area do triangulo retangulo
		areatri = a * c / 2.0;
		
	//b) area do circulo
		areacirc = pi * c * c;
		
	//c) area do trapezio
		areatrap = c * (a + b) / 2;
		
	//d) area do quadrado
		areaquad = b * b;
		
	//e) area do retangulo
		arearet = a * b;

		System.out.printf("TRIANGULO: %.3f\n", areatri);
		System.out.printf("CIRCULO: %.3f\n", areacirc);
		System.out.printf("TRAPEZIO: %.3f\n", areatrap);
		System.out.printf("QUADRADO: %.3f\n", areaquad);
		System.out.printf("RETANGULO: %.3f\n", arearet);
		
		sc.close();
	}
}

