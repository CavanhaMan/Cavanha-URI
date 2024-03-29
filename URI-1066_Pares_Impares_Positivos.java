/*------------------------*
| Rodrigo CavanhaMan      |
| URI 1066                |
| Pares Impares Positivos |
*-------------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x = 1, contapar = 0, contaimpar = 0, contapos = 0, contaneg = 0;
		float num;
		
		while (x <= 5) {
			num = sc.nextFloat();
			if (num % 2 == 0)
				contapar = contapar + 1;
			else
				contaimpar = contaimpar + 1;
			if (num > 0)
				contapos = contapos + 1;
			else if (num < 0)
				contaneg = contaneg + 1;
			x = x + 1;
		}
		System.out.printf("%d valor(es) par(es)\n",contapar);
		System.out.printf("%d valor(es) impar(es)\n",contaimpar);
		System.out.printf("%d valor(es) positivo(s)\n",contapos);
		System.out.printf("%d valor(es) negativo(s)\n",contaneg);
		sc.close();
	}
}