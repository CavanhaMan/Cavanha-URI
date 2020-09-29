/*-------------------*
| Rodrigo CavanhaMan |
| URI 2344           |
| Notad da Prova     |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int notaNum = sc.nextInt();
		if (notaNum == 0) System.out.println('E');
		else if (notaNum>=1 && notaNum<=35) System.out.println('D');
		else if (notaNum>=36 && notaNum<=60) System.out.println('C');
		else if (notaNum>=61 && notaNum<=85) System.out.println('B');
		else if (notaNum>=86 && notaNum<=100) System.out.println('A');
				
		sc.close();
	}
}