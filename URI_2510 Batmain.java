/*-------------------*
| Rodrigo CavanhaMan |
| URI 2510           |
| Batmain            |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		for (int i=0 ; i<t ; i++) {
			String viloes = sc.nextLine();
			if (!viloes.equals("Batman") && !viloes.equals("batman") && !viloes.equals("Batmain"))
				System.out.printf("Y\n");
			else
				System.out.printf("N\n");
		}
		sc.close();
	}
}