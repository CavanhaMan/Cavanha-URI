/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1157      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();
		
		for (int aux=1; aux<=n; aux++){
			if (n % aux == 0){
				System.out.println(aux);
			}
		}
		sc.close();
	}
}