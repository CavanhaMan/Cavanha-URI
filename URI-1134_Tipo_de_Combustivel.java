/*--------------------*
| Rodrigo CavanhaMan  |
| URI 1134            |
| Tipo de Combustivel |
*---------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int combustivel, stop=1;
		int soma1=0, soma2=0, soma3=0;
// 1 = Alcool
// 2 = Gasolina
// 3 = Diesel
// 4 = Fim
		
		while (stop != 2){
			if (stop == 1){
				combustivel = sc.nextInt();
				if (combustivel == 1)
					soma1 = soma1 + 1;
				else if (combustivel == 2)
					soma2 = soma2 + 1;
				else if (combustivel == 3)
					soma3 = soma3 + 1;
				else if (combustivel == 4)
					stop = 2;
				else 
					stop = 1;
			}
			if (stop == 2){
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\n",soma1);
				System.out.printf("Gasolina: %d\n",soma2);
				System.out.printf("Diesel: %d\n",soma3);
			}
		}
		sc.close();
	}
}