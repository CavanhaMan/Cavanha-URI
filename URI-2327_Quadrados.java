/*-------------------*
| Rodrigo CavanhaMan |
| URI 2327           |
| Quadrados          |
| (Maratona)         |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l, c;
//		int num = sc.nextInt(); //numero de repetições
		int n = sc.nextInt();
		//matriz[n][n]
		int[][] matriz = new int[n][n];
		
		int diagp=0, diags=0;
		int[] linhas = new int[n];
		int[] colunas = new int[n];
		
//		for(int i=0 ; i<num ; i++){
			
			for(l=0 ; l<n ; l++)
				for(c=0 ; c<n ; c++)
					matriz[l][c] = sc.nextInt();
			
			int aux1=0, aux2=0;
			for(l=0 ; l<n ; l++){
				aux1=0;
				aux2=0;
				for(c=0 ; c<n ; c++){
					//soma diagonal principal
					if(l==c)		diagp += matriz[l][c];
					//soma diagonal secundária
					if(l+c == n-1)	diags += matriz[l][c];
					//soma linhas
					aux1 += matriz[l][c];
					linhas[l] = aux1;
					//soma colunas
					aux2 += matriz[c][l];
					colunas[l] = aux2;
				}	
			}
			/*
			System.out.println("diagp "+diagp);
			System.out.println("diags "+diags);
			for(l=0 ; l<n ; l++){
				System.out.println("diagp "+linhas[l]);
				System.out.println("colunas "+colunas[l]);
			}
			*/
			
			//compara tudo
			int ok=1;
			for (int x=0 ; x<n ; x++){
				if (linhas[x]==diagp && diagp==diags && colunas[x]==diagp)
					ok=1;
				else
					ok=0;					
			}
			if (ok==1)
				System.out.println(diagp);
			else
				System.out.println("-1");
				
		
//		}		
		sc.close();
	}
}