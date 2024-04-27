/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 2168               |
| Crepúsculo em Portland |
*------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n = sc.nextInt();
		//n = (n+1)*(n+1);
		int[][] quadra = new int[n+1][n+1];
		
		for (int l=0 ; l<=n ; l++)
			for (int c=0 ; c<=n ; c++)
				quadra[l][c] = sc.nextInt();

		for (int l=0 ; l<n ; l++){
			for (int c=0 ; c<n ; c++){
				if(quadra[l][c]+quadra[l][c+1]+quadra[l+1][c]+quadra[l+1][c+1] < 2)
					System.out.printf("U");
	            else
	            	System.out.printf("S");
			}
			System.out.println();
		}
		sc.close();
	}
	
}