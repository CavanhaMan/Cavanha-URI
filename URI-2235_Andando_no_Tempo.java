/*-------------------*
| Rodrigo CavanhaMan |
| URI 2235           |
| Andando no Tempo   |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a==b || a==c || b==a || b==c )
			System.out.println("S");
		else if(a+b==c || a+c==b || b+c==a )
			System.out.println("S");
		else
			System.out.println("N");
			
		sc.close();
	}
}
