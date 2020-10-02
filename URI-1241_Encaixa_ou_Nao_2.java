/*-------------------*
| Rodrigo CavanhaMan |
| URI 1241           |
| Encaixa ou Não II  |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n = Integer.parseInt(sc.nextLine());
		for (int i=0; i<n; i++){
			String entrada = sc.nextLine(); 
			String[] entra = entrada.split(" ");
			String A = entra[0];
			String B = entra[1];
			if (A.equals(B))
				System.out.println("encaixa");
			else{
				int tamA = A.length();
				int tamB = B.length();
				int aux = tamA-tamB;
				if(aux<= 0)
					System.out.println("nao encaixa");
				else{
					A = A.substring(aux,tamA);
					if(A.equals(B))
						System.out.println("encaixa");
					else
						System.out.println("nao encaixa");
					}
				}
		}
		sc.close();
	}
}
