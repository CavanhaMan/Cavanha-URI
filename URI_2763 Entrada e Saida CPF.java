/*--------------------*
| Rodrigo CavanhaMan  |
| URI  2762           |
| Entrada e Saída CPF |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//XXX.YYY.ZZZ-DD
		String[] cpf = new String[4]; 
		cpf = sc.nextLine().split("\\.|-");
		for(int i=0; i<cpf.length ; i++)
			System.out.printf("%s\n",cpf[i]);
		sc.close();
	}
}
