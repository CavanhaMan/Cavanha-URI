/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1048      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double salario,reajuste,percentual;

		salario = sc.nextDouble();
		
		if (salario >= 0.00 && salario <= 400.00) {
			percentual = 15.00;
			reajuste = salario * percentual / 100;
		}
		else if (salario > 400.00 && salario <= 800.00) {
			percentual = 12.00;
			reajuste = salario * percentual / 100;
		}
		else if (salario > 800.00 && salario <= 1200.00) {
			percentual = 10.00;
			reajuste = salario * percentual / 100;
		}
		else if (salario > 1200.00 && salario <= 2000.00) {
			percentual = 7.00;
			reajuste = salario * percentual / 100;
		}
		else {
			percentual = 4.00;
			reajuste = salario * percentual / 100;
		}
		
		System.out.printf("Novo salario: %.2f\n",(salario+reajuste));
		System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		System.out.printf("Em percentual: %.0f %%\n",percentual);
		

		sc.close();
	}
}