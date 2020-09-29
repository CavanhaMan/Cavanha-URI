/*-------------------*
| Rodrigo CavanhaMan |
| URI 1541           |
| Construindo  Casas |
*--------------------*
O input terá A(lado da casa) >> B(outro lado) >> C(percentual)
Ex: Se a casa tem 80 de area, 80 está para 20% assim como 400 esta para 100%, regra de 3)
O exercicio quer o lado do terreno, em inteiro.
Quando input for zero, o programa deve acabar.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e=0;
		while (true){
			int a = sc.nextInt(); if (a==0) break;
			int b = sc.nextInt(); if (b==0) break;
			int c = sc.nextInt(); if (c==0) break;
			double d = (int)(a*b*100)/c;
			e= (int) Math.pow(d,0.5);
			System.out.println(e);
		}
		sc.close();
	}
}