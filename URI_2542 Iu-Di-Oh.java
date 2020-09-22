/*-------------------*
| Rodrigo CavanhaMan |
| URI 2542           |
| Iu-Di-Oh!          |
*--------------------*/
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt(); //numero de atributos de cada carta
			int m = sc.nextInt(); //numero de cartas de Marcos
			int l = sc.nextInt(); //numero de cartas de Leonardo
			
			long[][] cartasM = new long[m][n]; //cartas de Marcos
			//entra cartas de Marcos
			for(int i=0 ; i<m ; i++)
				for(int j=0 ; j<n ; j++)
					cartasM[i][j] = sc.nextLong();
			
			long[][] cartasL = new long[l][n]; //cartas de Leonardo
			//entra cartas de Leonardo
			for(int i=0 ; i<m ; i++)
				for(int j=0 ; j<n ; j++)
					cartasL[i][j] = sc.nextLong();
			
			int cm; //cartas escolhidas por Marcos
			cm = sc.nextInt()-1;
			int cl; //cartas escolidas por Leonardo
			cl = sc.nextInt()-1;
			int a; //atributo sorteado
			a = sc.nextInt()-1;
			
			long Marcos   = cartasM[cm][a];
			long Leonardo = cartasL[cl][a];
			
			if (Marcos > Leonardo)
				System.out.println("Marcos");
			else if (Leonardo > Marcos)
				System.out.println("Leonardo");
			else
				System.out.println("Empate");
		}
		sc.close();
	}
}