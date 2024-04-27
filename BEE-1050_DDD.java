/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1050      |
+--------------------+
*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int ddd,check=0;

		ddd = sc.nextInt();
		
		if (ddd == 61) {
			System.out.println("Brasilia");
			check=1;
		}
		if (ddd == 71) {
			System.out.println("Salvador");
			check=1;
		}
		if (ddd == 11) {
			System.out.println("Sao Paulo");
			check=1;
		}
		if (ddd == 21) {
			System.out.println("Rio de Janeiro");
			check=1;
		}
		if (ddd == 32) {
			System.out.println("Juiz de Fora");
			check=1;
		}
		if (ddd == 19) {
			System.out.println("Campinas");
			check=1;
		}
		if (ddd == 27) {
			System.out.println("Vitoria");
			check=1;
		}
		if (ddd == 31) {
			System.out.println("Belo Horizonte");
			check=1;
		}
		if (check == 0) {
			System.out.println("DDD nao cadastrado");
		}
		

		sc.close();
	}
}