/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1435      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//MATRIZ[LINHA][COLUNA]
		int min=1, linha,coluna;
		int N = sc.nextInt();
		// i, j, N-i+1, N-j+1
		while (N != 0){
			for(linha=1 ; linha<=N ; linha++)
				for(coluna=1 ; coluna<=N ; coluna++){
					min = linha;
					if (coluna < min)
						min = coluna;
					if (N-linha+1 < min)
						min = N-linha+1;
					if (N-coluna+1 < min)
						min = N-coluna+1;
					System.out.printf("%3d",min);
					if (coluna<N)
						System.out.printf(" ");
					else 
						System.out.printf("\n");
				}
			N = sc.nextInt();
			min = 1;
		}
	sc.close();
	}
}