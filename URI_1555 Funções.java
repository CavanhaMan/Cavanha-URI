/*-------------------*
| Rodrigo CavanhaMan |
| URI 1555           |
| Funcoes            |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			double r, b, c;
			
			r = Math.pow(3*x, 2) + Math.pow(y, 2);
			b = 2*(Math.pow(x, 2)) + Math.pow(5*y, 2);
			c = -100*x + Math.pow(y, 3);
			
			//System.out.println(r + " " + b + " " + c);
			if (r > b && r>c)
				System.out.println("Rafael ganhou");
			if (b>r && b>c)
				System.out.println("Beto ganhou");
			if (c>b && c>r)
				System.out.println("Carlos ganhou");
		}
		sc.close();
	}
}