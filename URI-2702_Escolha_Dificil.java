/*-------------------*
| Rodrigo CavanhaMan |
| BEE 2702           |
| Escolha Difícil    |
*--------------------*/
import java.util.Scanner;
//import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));

		String estoque = sc.nextLine();
		String[] est = estoque.split(" ");
		String choice = sc.nextLine();
		String[] cho = choice.split(" ");
		
		//chicken beef pasta		
		int c = Integer.parseInt(est[0]);
		int b = Integer.parseInt(est[1]);
		int p = Integer.parseInt(est[2]);
		int pc = Integer.parseInt(cho[0]);
		int pb = Integer.parseInt(cho[1]);
		int pp = Integer.parseInt(cho[2]);
		int auxC=0, auxB=0, auxP=0;
		
		if (pc>c) auxC = pc-c;
		if (pb>b) auxB = pb-b;
		if (pp>p) auxP = pp-p;
		
		System.out.println(auxC + auxB + auxP);
		sc.close();
	}
}
/*
chicken beef pasta
c, b e p

passengers choice
pc, pb, pp
*/
