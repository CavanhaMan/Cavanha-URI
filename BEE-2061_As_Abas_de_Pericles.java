/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2061            |
| As Abas de Pericles |
*---------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		if (N>0 && M<500){
			//String[] acao = new String[M];
			String acao = "";
			int abas=N;
			for (int i=0 ; i<M ; i++){
				acao = sc.nextLine();
				if (acao.equals("fechou"))
					abas++;
				if (acao.equals("clicou"))
					abas--;
			}
			System.out.println(abas);
		}
		sc.close();
	}
}