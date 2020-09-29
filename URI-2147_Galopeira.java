/*-------------------*
| Rodrigo CavanhaMan |
| URI 2147           |
| Galopeira          |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int C = Integer.parseInt(sc.nextLine());
		
		for(int i=0 ; i<C ; i++){
			String entrada = sc.nextLine();
			Double resultado = (double)entrada.length() * 0.01;
			System.out.printf("%.2f\n",resultado);
		}
		sc.close();
	}
}