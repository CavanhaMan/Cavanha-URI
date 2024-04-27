/*-------------------*
| Rodrigo CavanhaMan |
| URI 1805           |
| Soma Natural       |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		long soma=0;
		for(int i=a ; i<=b ; i++)
			soma+=i;
		System.out.println(soma);
		sc.close();
	}
}