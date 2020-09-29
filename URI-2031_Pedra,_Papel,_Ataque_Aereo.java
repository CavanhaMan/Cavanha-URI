/*-------------------------*
| Rodrigo CavanhaMan       |
| URI 2031                 |
| Pedra Papel Ataque Aereo |
*--------------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		
		for (int i=0 ; i<N ; i++){
		
			String j1 = sc.nextLine();
			String j2 = sc.nextLine();
			
			//ataque vs. Pedra: ataque
			if (j1.equals("ataque") && j2.equals("pedra"))
				System.out.println("Jogador 1 venceu");
			else if (j2.equals("ataque") && j1.equals("pedra"))
				System.out.println("Jogador 2 venceu");

			//Pedra vs. Papel: Pedra
			else if (j1.equals("pedra") && j2.equals("papel"))
				System.out.println("Jogador 1 venceu");
			else if (j2.equals("pedra") && j1.equals("papel"))
				System.out.println("Jogador 2 venceu");
			
			//Papel vs. ataque: ataque
			else if (j1.equals("ataque") && j2.equals("papel"))
				System.out.println("Jogador 1 venceu");
			else if (j2.equals("ataque") && j1.equals("papel"))
				System.out.println("Jogador 2 venceu");
			
			//Papel vs. Papel: ambos ganham
			else if (j1.equals("papel") && j2.equals("papel"))
				System.out.println("Ambos venceram");
			
			//Pedra vs. Pedra: não há ganhador
			else if (j1.equals("pedra") && j2.equals("pedra"))
				System.out.println("Sem ganhador");
			
			//ataque vs. ataque: todos os jogadores perdem
			else if (j1.equals("ataque") && j2.equals("ataque"))
				System.out.println("Aniquilacao mutua");
		}
		
		sc.close();
	}
}	