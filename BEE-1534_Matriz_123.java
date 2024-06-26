/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1534      |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
// Diagonal principal preenchida com 1 (\)
// Diagonal secundária preenchida com 2 (/)
//  (inclusive onde tinha 1 na interseção)
// Todo o restante preenchido com 3 (X)
		
		//MATRIZ[L][C]
		int L, C;
		
		// i, j, N-i+1, N-j+1
		while (sc.hasNext()){
			int N = sc.nextInt();
			if (N>=3 && N<70)
				for(L=1 ; L<=N ; L++)
					for(C=1 ; C<=N ; C++){
						if (C+L-1 == N)
							System.out.printf("2");
						else if (C==L)
							System.out.printf("1");
						else 
							System.out.printf("3");
						if (C>=N)
							System.out.printf("\n");
					}
		}
	sc.close();
	}
}