/*---------------------*
| Rodrigo CavanhaMan   |
| URI 2552             |
| Pão de Quejo Sweeper |
*----------------------*/
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] tabuleiro = new int[n][m];
			for(int i=0 ; i<n ; i++)
				for(int j=0 ; j<m ; j++)
					tabuleiro[i][j] = sc.nextInt();

			for(int i=0 ; i<n ; i++)
				for(int j=0 ; j<m ; j++)
					if(tabuleiro[i][j]==1)
						tabuleiro[i][j]=9;

			int somapao;
			for(int i=0 ; i<n ; i++)
				for(int j=0 ; j<m ; j++)
					if(tabuleiro[i][j]==0){
						somapao=0;
						if(j-1>=0) if(tabuleiro[i][j-1]==9) somapao++;
						if(j+1<m) if(tabuleiro[i][j+1]==9) somapao++;
						if(i-1>=0) if(tabuleiro[i-1][j]==9) somapao++;
						if(i+1<n) if(tabuleiro[i+1][j]==9) somapao++;
						tabuleiro[i][j]=somapao;
					}
			
			for(int i=0 ; i<n ; i++){
				for(int j=0 ; j<m ; j++)
					System.out.printf("%d",tabuleiro[i][j]);
				System.out.println();
			}
		}
		sc.close();
	}
}