/*-------------------*
| Rodrigo CavanhaMan |
| URI 1008           |
| Salario            |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int num = sc.nextInt();
		int hrtrab = sc.nextInt();
		double vrhora = sc.nextDouble();
		double salario = hrtrab * vrhora; 
		
		System.out.printf("NUMBER = %d\n",num);
		System.out.printf("SALARY = U$ %.2f\n",salario);
	
		sc.close();
	}
}
