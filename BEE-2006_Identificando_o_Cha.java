/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2006            |
| Identificando o Cha |
*---------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipocha = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int certos = 0;
		
		if (a==tipocha) certos++;
		if (b==tipocha) certos++;
		if (c==tipocha) certos++;
		if (d==tipocha) certos++;
		if (e==tipocha) certos++;
		
		System.out.println(certos);
		
		sc.close();
	}
}	