/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1153      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, fat=1;

		n = sc.nextInt();
		
		while (n >= 13 || n <= 0){
			n = sc.nextInt();
		}
		
		for (int aux = n; aux > 0; aux--){
			fat = fat * aux;
		}
		System.out.println(fat);
		sc.close();
	}
}