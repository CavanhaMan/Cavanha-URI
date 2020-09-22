/*-------------------*
| Rodrigo CavanhaMan |
| URI 2172           |
| Evento             |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X, M;
		X = sc.nextInt();
		M = sc.nextInt();
		while(X!=0 && M!=0){
			int EXP = X*M;
			System.out.println(EXP);
			X = sc.nextInt();
			M = sc.nextInt();
		}
		sc.close();
	}
	
}