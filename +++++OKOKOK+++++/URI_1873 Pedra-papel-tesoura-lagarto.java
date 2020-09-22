/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1873      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int okA=0, oka=0, okn=0;
		int N = sc.nextInt();
		
		for(int x=0 ; x<N ; x++){

			String raj = sc.next();
			String shel = sc.next();

			if (raj.compareTo(shel)==0)
				System.out.println("empate");
			else{
				if (raj.equals("lagarto")){
					if (shel.equals("spock") || shel.equals("papel"))
						System.out.println("rajesh");
					else
						System.out.println("sheldon");
				}
				else if (raj.equals("papel")){
					if (shel.equals("spock") || shel.equals("pedra"))
						System.out.println("rajesh");
					else
						System.out.println("sheldon");
				}
				else if (raj.equals("pedra")){
					if (shel.equals("tesoura") || shel.equals("lagarto"))
						System.out.println("rajesh");
					else
						System.out.println("sheldon");
				}
				else if (raj.equals("tesoura")){
					if (shel.equals("papel") || shel.equals("lagarto"))
						System.out.println("rajesh");
					else
						System.out.println("sheldon");
				}
				else if (raj.equals("spock")){
					if (shel.equals("pedra") || shel.equals("tesoura"))
						System.out.println("rajesh");
					else
						System.out.println("sheldon");
				}
			}	
		}
		sc.close();
	}

}

/*
Lagarto adormece Spock
Lagarto come papel

Papel refuta Spock
Papel cobre pedra

Pedra quebra tesoura
Pedra derruba lagarto

Tesoura corta papel
Tesoura prende lagarto


Spock vaporiza pedra
Spock derrete tesoura
*/