/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1178      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		double[] n = new double[101];
		double x, aux;
		x = sc.nextDouble();
		aux = x;
		for(int i=0; i<100; i++){
			n[i] = aux;
			aux = aux/2; 
		}
				
		for (int z = 0; z < 100; z++)
			System.out.printf("N[%d] = %.4f\n",z,n[z]);
		sc.close();
	}
}