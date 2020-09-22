/*-------------------*
| Rodrigo CavanhaMan |
| URI 2540           |
|Impeachment do Líder|
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			int total = sc.nextInt();
			double contavotos=0;
			for (int i=0 ; i<total ; i++)
				if (sc.nextInt()==1)
					contavotos++;

			double doisterços = total*0.6666666666666667;
			if(contavotos>=doisterços)
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
		}
		sc.close();
	}
}
