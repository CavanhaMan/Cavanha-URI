/*----------------------*
| Rodrigo CavanhaMan    |
| URI 1924              |
| Vitória e a Indecisão |
*-----------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
	
		int n = Integer.parseInt(sc.nextLine());
		String[] cursos = new String[n];
		for(int i=0 ; i<n ; i++)
			cursos[i] = sc.nextLine();
		System.out.println("Ciencia da Computacao");
		sc.close();
	}
}