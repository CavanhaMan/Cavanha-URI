/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1159      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, somapar=0, contapar;
		x = sc.nextInt();
		while (x != 0) {

			if (x % 2 == 0){
				for (contapar = x; contapar<=x+8; contapar+=2){
					somapar+=contapar;
				}
			System.out.println(somapar);
			}
			else {
				for (contapar = x+1; contapar<=x+9; contapar+=2){
					somapar+=contapar;
				}
			System.out.println(somapar);
			}

			x = sc.nextInt();
			somapar = 0;
		}
		sc.close();
	}
}