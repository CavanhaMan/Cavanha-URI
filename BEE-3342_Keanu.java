/*-------------------*
| Rodrigo CavanhaMan |
| URI 3342           |
| Keanu              |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int casas;
		if(n%2==0) {
			casas = n*n/2;
			System.out.printf("%d casas brancas e %d casas pretas\n",casas,casas);
		}
		else {
			casas = (n*n-1)/2;
			System.out.printf("%d casas brancas e %d casas pretas\n",casas+1,casas);
		}
		sc.close();
	}
}
