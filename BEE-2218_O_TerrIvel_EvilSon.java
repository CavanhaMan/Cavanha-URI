/*-------------------*
| Rodrigo CavanhaMan |
| URI 2218           |
| O Temível Evil-Son |
*--------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++) {
			int c = sc.nextInt();
			System.out.println(((c*(c+1))/2)+1);
		}
		sc.close();
	}
}
