/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1049      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();
		
		if (AN1.equals("vertebrado")) {
			if (AN2.equals("ave")) {
				if (AN3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else {
				if (AN3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if (AN2.equals("inseto")) {
				if (AN3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
			}
			else {
				if (AN3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
		}

		sc.close();
	}
}