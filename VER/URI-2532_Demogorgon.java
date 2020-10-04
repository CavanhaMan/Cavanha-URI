package projeto01;
/*-------------------*
| Rodrigo CavanhaMan |
| URI 2532           |
| Demogorgon         |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			String[] e1 = sc.nextLine().split(" ");
			int nFeiticos = Integer.parseInt(e1[0]); 	//numero de feiticos meus (usados apenas 1x) 
			int pontosVida = Integer.parseInt(e1[1]); 	//pontos de vida demogorgon
			int somaMana=0, somaDano=0, somaVida=pontosVida;
			int[] danoCausado = new int[nFeiticos];		//pontos de Dano no demogorgon 
			int[] manaCusto = new int[nFeiticos];			//manaCusto para fazer feiticos
			int aux=0, res=0;
			
			for (int i=0 ; i<nFeiticos ; i++) {
				String[] e2 = sc.nextLine().split(" ");
				danoCausado[i] = Integer.parseInt(e2[0]); 
				manaCusto[i] = Integer.parseInt(e2[1]); 
				if (somaVida > danoCausado[i]) {
					somaVida-=danoCausado[i];
					somaMana+=manaCusto[i];
					somaDano+=danoCausado[i];
				}
				else if (somaVida < danoCausado[i]) {
					aux = danoCausado[i] - somaVida;
					aux = danoCausado[i]/aux;
					res = manaCusto[i]/aux;
					somaMana+=res;
					somaDano+=danoCausado[i];
				}
			}
			if (somaDano >= pontosVida)
				System.out.println(somaMana);
			else
				System.out.println("-1");
		}
		sc.close();
	}
}
//Dados os pontos de vida do demogorgon e os feitiços que você pode utilizar,
//determine a quantidade mínima de manaCusto necessária para derrotar o monstro.