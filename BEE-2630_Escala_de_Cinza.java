/*---------------------*
| Rodrigo CavanhaMan   |
| URI 2582             |
| System of a Download |
*----------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int escolha1,escolha2;
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++){
			escolha1 = sc.nextInt();
			escolha2 = sc.nextInt();
			if(escolha1+escolha2==0) System.out.println("PROXYCITY");
			else if(escolha1+escolha2==1) System.out.println("P.Y.N.G.");
			else if(escolha1+escolha2==2) System.out.println("DNSUEY!");
			else if(escolha1+escolha2==3) System.out.println("SERVERS");
			else if(escolha1+escolha2==4) System.out.println("HOST!");
			else if(escolha1+escolha2==5) System.out.println("CRIPTONIZE");
			else if(escolha1+escolha2==6) System.out.println("OFFLINE DAY");
			else if(escolha1+escolha2==7) System.out.println("SALT");
			else if(escolha1+escolha2==8) System.out.println("ANSWER!");
			else if(escolha1+escolha2==9) System.out.println("RAR?");
			else if(escolha1+escolha2==10) System.out.println("WIFI ANTENNAS");
		}
		
		sc.close();
	}
}
