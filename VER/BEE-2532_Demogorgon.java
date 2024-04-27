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
			String entra;
			String entrada = sc.nextLine();
			if (entrada.equals(""))
				entra = sc.nextLine();
			else
				entra = entrada;
			//String[] e1 = sc.nextLine().split(" ");
			String[] e1 = entra.split(" ");
			int nFeiticos = Integer.parseInt(e1[0]); 	//numero de feiticos meus (usados apenas 1x) 
			int pontosVida = Integer.parseInt(e1[1]); 	//pontos de vida demogorgon
			//System.out.println("pontosVida:"+pontosVida);
			int somaMana=0, somaDano=0, somaVida=pontosVida;
			int danoCausado = 0;		//pontos de Dano no demogorgon 
			int manaCusto = 0;			//manaCusto para fazer feiticos
			int aux=0, res=0;
			
			for (int i=0 ; i<nFeiticos ; i++) {
				String[] e2 = sc.nextLine().split(" ");
				danoCausado = Integer.parseInt(e2[0]); 
				manaCusto = Integer.parseInt(e2[1]); 
				if (somaVida > danoCausado) {
					somaVida-=danoCausado;
					somaMana+=manaCusto;
					somaDano+=danoCausado;
					//System.out.println("1");
				}
				else if (somaVida == danoCausado) {
					somaVida=0;
					somaMana+=manaCusto;
					somaDano+=danoCausado;
					//System.out.println("3");
				}
				else if (somaVida < danoCausado) {
					aux = danoCausado - somaVida;
					aux = danoCausado/aux;
					res = manaCusto/aux;
					somaMana+=res;
					somaDano+=danoCausado;
					//System.out.println("2");
					break;
				}
			}
			//System.out.println("somaDano:"+somaDano);
			//System.out.println("somaMana:"+somaMana);
			//System.out.println("pontosVida:"+pontosVida);
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