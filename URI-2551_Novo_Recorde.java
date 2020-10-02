/*-------------------*
| Rodrigo CavanhaMan |
| URI 2551           |
| Novo Recorde       |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while (sc.hasNext()) {
			int N = sc.nextInt(); //num de treinos feitos
			double R = 0; //para calcular o record
			
			for (int i=1 ; i<=N ; i++) {
				Double T = sc.nextDouble(); //duracao do treino
				Double D = sc.nextDouble(); //distancia percorrida no treino
				if (D/T > R) {
					System.out.println(i);;
					R = D/T;
				}
			}
		}
		sc.close();
	}
}
