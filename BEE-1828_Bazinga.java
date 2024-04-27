/*-------------------*
| Rodrigo CavanhaMan |
| URI 1828           |
| Bazinga!           |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		for(int i=0 ; i<t ; i++){
			String sheldon = sc.next();
			String raj = sc.next();
			System.out.printf("Caso #%d: ",i+1);
			//empate: "De novo!". 
			if(sheldon.equals(raj)) System.out.println("De novo!");
			//Sheldon vence: "Bazinga!"
			else if(sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) System.out.println("Bazinga!");
			else if(sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) System.out.println("Bazinga!");
			else if(sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) System.out.println("Bazinga!");
			else if(sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))) System.out.println("Bazinga!");
			else if(sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) System.out.println("Bazinga!");
			//Raj vence: "Raj trapaceou!"
			else System.out.println("Raj trapaceou!");
		}
		sc.close();
	}
}
//tesoura corta papel;
//papel embrulha pedra;
//pedra esmaga lagarto;
//lagarto envenena Spock;
//Spock destrói tesoura;
//tesoura decapita lagarto;
//lagarto come papel;
//papel contesta Spock;
//Spock vaporiza pedra;
//pedra quebra tesoura.
