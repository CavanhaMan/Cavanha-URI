/*---------------------*
| Rodrigo CavanhaMan   |
| URI 2163             |
| O Despertar da Forca |
*----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int achou=0;
		int N = sc.nextInt();
		int M = sc.nextInt();		
		int[][] terreno = new int[N][M];
		//MATRIZ[L][C]
		int sabreL=0,sabreC=0;
		for(int L=0 ; L<N ; L++)
			for(int C=0 ; C<M ; C++)
				terreno[L][C]=sc.nextInt();
		for(int L=N-1 ; L>=0 ; L--)
			for(int C=M-1 ; C>=0 ; C--)
				if (terreno[L][C]==42)
					if (L-1>=0 && C-1>=0 && L+1<N && C+1<M)
						if(terreno[L-1][C-1]==7 &&
						terreno[L-1][C]==7 &&
						terreno[L-1][C+1]==7 &&
						terreno[L][C-1]==7 &&
						terreno[L][C+1]==7 &&
						terreno[L+1][C-1]==7 &&
						terreno[L+1][C]==7 &&
						terreno[L+1][C+1]==7){
							sabreL=L;
							sabreC=C;
							//System.out.printf("%d %d\n", L+1,C+1);
							achou=1;
						}
		if (achou==1)
			System.out.printf("%d %d\n", sabreL+1,sabreC+1);
		else
			System.out.println("0 0");
		sc.close();
	}
}