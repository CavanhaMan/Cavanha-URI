/*-------------------*
| Rodrigo CavanhaMan |
| URI 2310           |
| Voleibol           |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int n = Integer.parseInt(sc.next());
		String nome = "";
		double saquep=0.0, ataquep=0.0, bloqueiop=0.0;
		double saque=0, bloqueio=0, ataque=0;
		double saqueok=0, bloqueiook=0, ataqueok=0;

		for (int i=0 ; i<n ; i++){
			nome = sc.next();
			saque += sc.nextDouble();
			bloqueio += sc.nextDouble();
			ataque += sc.nextDouble();
			saqueok += sc.nextDouble();
			bloqueiook += sc.nextDouble();
			ataqueok += sc.nextDouble();
			/*
			saque   = 100%
			saqueok = x 
			x = saqueok * 100 / saque;
			*/
		}
		saquep = saqueok * 100.00 / saque;
		bloqueiop = bloqueiook * 100.00 / bloqueio;
		ataquep = ataqueok * 100.00 / ataque;

		System.out.printf("Pontos de Saque: %.2f %%.\n",saquep);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n",bloqueiop);
		System.out.printf("Pontos de Ataque: %.2f %%.\n",ataquep);
		
		sc.close();
	}
}