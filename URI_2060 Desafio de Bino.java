/*-------------------*
| Rodrigo CavanhaMan |
| URI 2060           |
| Desafio de Bino    |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		//2, 3, 4 e 5
		int mult2=0, mult3=0, mult4=0, mult5=0;
		
		for (int i=0 ; i<N ; i++){
			int L = sc.nextInt();
			if (L%2==0) mult2++;
			if (L%3==0) mult3++;
			if (L%4==0) mult4++;
			if (L%5==0) mult5++;
		}
		System.out.printf("%d Multiplo(s) de 2\n",mult2);
		System.out.printf("%d Multiplo(s) de 3\n",mult3);
		System.out.printf("%d Multiplo(s) de 4\n",mult4);
		System.out.printf("%d Multiplo(s) de 5\n",mult5);

		sc.close();
	}
}