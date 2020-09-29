/*-------------------*
| Rodrigo CavanhaMan |
| URI 1467           |
| Zerinho ou Um      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a==0 && b==0 && c==1 || a==1 && b==1 && c==0) System.out.println("C");
			if (a==0 && b==1 && c==0 || a==1 && b==0 && c==1) System.out.println("B");
			if (a==1 && b==0 && c==0 || a==0 && b==1 && c==1) System.out.println("A");
			if (a==0 && b==0 && c==0 || a==1 && b==1 && c==1) System.out.println("*");
		}
		sc.close();
	}	
}