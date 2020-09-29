/*-------------------*
| Rodrigo CavanhaMan |
| URI 2547           |
| Montanha-Russa     |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n, min, max, altura, conta=0;
			n = sc.nextInt();
			min = sc.nextInt();
			max = sc.nextInt();
			for (int x=0 ; x<n ; x++) {
				altura = sc.nextInt();
				if (altura>=min && altura>=50 && altura<=max && altura <=250 && min<=max && min>=50 && max<=250)
					conta++;
			}
			System.out.println(conta);
		}
		sc.close();
	}
}
