/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1009      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double salario, vendas, total;
		String vendedor = sc.nextLine();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		total = salario + (15*vendas)/100;
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		sc.close();
	}
}