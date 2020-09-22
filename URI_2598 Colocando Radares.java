/*-------------------*
| Rodrigo CavanhaMan |
| URI 2598           |
| Colocando Radares  |
*--------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		for(int i=0 ; i<c ; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			double cam = (n/m);
			int res = (int)Math.ceil(cam);
			if (n%m > 0)
				System.out.println(res+1);
			else
				System.out.println(res);
		}
		sc.close();
	}
}