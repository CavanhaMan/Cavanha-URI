/*---------------------------*
| Rodrigo CavanhaMan         |
| URI 1864                   |
| Nossos Dias Nunca Voltarão |
*----------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		String fr[] = new String[34];
		fr = frase.split("");
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++)
			System.out.printf("%s",fr[i]);
		System.out.println();
		sc.close();
	}
}
