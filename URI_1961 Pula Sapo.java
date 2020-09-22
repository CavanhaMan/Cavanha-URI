/*-------------------*
| Rodrigo CavanhaMan |
| URI 1961           |
| Pula Sapo          |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int sapo = sc.nextInt();
		int ncanos = sc.nextInt();
		int canoant, canoatual=0;
		int ok=0;
		canoant=sc.nextInt();				//entra primeiro cano
		for (int i=1 ; i<ncanos ; i++){
			canoatual = sc.nextInt();		//entra segundo cano em diante
			if (canoant < canoatual){
				if (canoant+sapo < canoatual){	//compara o canto anterior com o atual
					System.out.println("GAME OVER"); //se for menor, game over
					ok=1;
					break;
				}
				else
					canoant=canoatual;			//senao, cano anterior passa a ser o atual
			}
			else{
				if (canoatual+sapo < canoant){
					System.out.println("GAME OVER");
					ok=1;
					break;
				}
				else
					canoant=canoatual;
			}
		}
		if(ok==0)
			System.out.println("YOU WIN");
		
	}
}