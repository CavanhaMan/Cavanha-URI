/*-------------------*
| Rodrigo CavanhaMan |
| URI 2170           |
| Juros do Projeto   |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int conta = 0;
		while(sc.hasNext()){
			conta++;
			Double a = sc.nextDouble();
			Double b = sc.nextDouble();
			Double juros = (b-a)*100.00/a;
			System.out.printf("Projeto %d:\n",conta);
			System.out.printf("Percentual dos juros da aplicacao: %.2f %%\n\n",juros);
		}
	}
}