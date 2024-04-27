/*-------------------*
| Rodrigo CavanhaMan |
| URI 1169           |
| Trigo no Tabuleiro |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			System.out.printf("%.0f kg\n",Math.floor(Math.pow(2, x)/12000));
		}
		sc.close();
	}
}