/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1041      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		float x,y;
		x = sc.nextFloat();
		y = sc.nextFloat();

		if (x == 0 && y == 0){
			System.out.println("Origem");
		}
		else if(x == 0){
			System.out.println("Eixo Y");
		}
		else if(y == 0){
			System.out.println("Eixo X");
		}
		else{
			if (x > 0 && y > 0){
				System.out.println("Q1");
				}
			if (x < 0 && y > 0){
				System.out.println("Q2");
				}
			if (x < 0 && y < 0){
				System.out.println("Q3");
				}
			if (x > 0 && y < 0){
				System.out.println("Q4");
				}
			}

		sc.close();
	}
}