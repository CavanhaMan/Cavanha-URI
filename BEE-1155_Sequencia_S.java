/*-------------------*
| Rodrigo CavanhaMan |
| URI 1155           |
| Sequencia S        |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double s=1, aux;
		for (aux=2; aux<=100; aux++){
			s = s + (1/aux);
		}
		System.out.printf("%.2f\n",s);
		sc.close();
	}
}