/*--------------------------*
| Rodrigo CavanhaMan        |
| URI 1198                  |
| O Bravo Guerreiro Hashmat |
*---------------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println(Math.abs(a-b));
		}		
		sc.close();
	}
}