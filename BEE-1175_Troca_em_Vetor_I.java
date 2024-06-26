/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1175      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int[] w = new int[20];
		int[] z = new int[20];
		
		for (int f = 0; f < 20; f++)
			w[f]=sc.nextInt();
		
		int j=19, i=0;
		while (i<20 || j>0){
			z[j] = w[i];
			j--;
			i++;
		}

		for (int x = 0; x < 20; x++)
			System.out.printf("N[%d] = %d\n",x,z[x]);
		
		sc.close();
	}
}