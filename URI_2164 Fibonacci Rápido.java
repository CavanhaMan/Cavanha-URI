/*-------------------*
| Rodrigo CavanhaMan |
| URI 2164           |
| Fibonacci Rápido   |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n = sc.nextInt();
		Double fibonacci;
		if (n>=0 && n<=50){
			double raiz5 = Math.sqrt(5);
			double conta1 = (1 + raiz5) / 2;
			double elevado1 = Math.pow(conta1,n);
			double conta2 = (1 - raiz5) / 2;
			double elevado2 = Math.pow(conta2,n);
			fibonacci = (elevado1-elevado2)/raiz5;
			
			System.out.printf("%.1f\n",fibonacci);
		}
		sc.close();
	}
}