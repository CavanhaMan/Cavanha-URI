/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1478      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//MATRIZ[L][C]
		int conta=1, L, C, aux, X=1;
		int N = sc.nextInt();
		// i, j, N-i+1, N-j+1
		while (N != 0){
			for(L=1 ; L<=N ; L++){
				for(C=L ; C>=1 ; C--)
					System.out.printf("%3d",C);
				for(C=2 ; C<=N-L+1 ; C++)
					System.out.printf("%3d",C);
				System.out.printf("\n");
			}
			N = sc.nextInt();
		}
	sc.close();
	}
}