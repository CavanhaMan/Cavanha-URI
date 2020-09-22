/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2221            |
| Batalha de Pomekons |
*---------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ataque1=0 ,defesa1=0, bonus1=0, nivel1=0;
		int ataque2=0 ,defesa2=0, bonus2=0, nivel2=0;
		
		int T = sc.nextInt();
		for (int i=0 ; i<T ; i++){
			int bonus = sc.nextInt();
			
			ataque1 = sc.nextInt();
			defesa1 = sc.nextInt();
			nivel1  = sc.nextInt();
			if(nivel1%2==0) bonus1=bonus;
			else bonus1=0;
			int valorgolpe1 = (ataque1+defesa1)/2 + bonus1;
			
			ataque2 = sc.nextInt();
			defesa2 = sc.nextInt();
			nivel2  = sc.nextInt();
			if(nivel2%2==0)	bonus2=bonus;
			else bonus2=0;
			int valorgolpe2 = (ataque2+defesa2)/2 + bonus2;
			
			if (valorgolpe1>valorgolpe2)
				System.out.println("Dabriel");
			else if (valorgolpe2>valorgolpe1)
				System.out.println("Guarte");
			else
				System.out.println("Empate");
		}
		
		sc.close();
	}
	
}	