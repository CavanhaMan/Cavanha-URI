/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1184      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int MEDIA=0, l, c;
		char O = sc.next().charAt(0);
		double SOMA=0.0;
		double[][] n = new double[12][12];

		for(l=0; l<12; l++)
			for(c=0; c<12; c++)
				n[l][c] = sc.nextDouble();

		//MATRIZ[LINHA][COLUNA]

		for(l=0; l<12; l++)
			for(c=0; c<12; c++){
				if (l > c){
					SOMA += n[l][c];
					if (n[l][c] != 0)
						MEDIA++;
				}
			}

/*		for(l=0; l<12; l++){
			System.out.printf("\n");
			for(c=0; c<12; c++)
				System.out.printf("%.1f ",n[l][c]);
		}
	*/	
		if (O == 'S')
			System.out.printf("%.1f\n",SOMA);
		if (O == 'M')
			System.out.printf("%.1f\n",SOMA/MEDIA);

		sc.close();
	}
}