/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1149      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, n, soma=0;

		a = sc.nextInt();
		n = sc.nextInt();
		
		while (n <= 0){
			n = sc.nextInt();
		}
		
		for (int aux = 1; aux <= n; aux++){
			soma = soma + a;
			a++;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}