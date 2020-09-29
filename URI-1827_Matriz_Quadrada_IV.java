/*-------------------*
| Rodrigo CavanhaMan |
| URI 1827           |
| Matriz Quadrada IV |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()){
			int lin=0, col=0;
			int t=sc.nextInt();
			long[][] mat = new long[t][t];
			int meio=t/2;
			
			//a parte externa é preenchida com 0
			for(lin=0; lin<t; lin++)
				for(col=0; col<t; col++)
					mat[lin][col] = 0;
			//a diagonal principal é preenchida com 2
			for(lin=0; lin<t; lin++)
				for(col=0; col<t; col++)
					if(lin==col) mat[lin][col] = 2;
			//a diagonal secundária é preenchida com 3
			for(lin=0; lin<t; lin++)
				for(col=0; col<t; col++)
					if(lin+col==t-1) mat[lin][col] = 3;

			//a parte interna é preenchida com 1
	        int c=t/3;
	        int e=t-c-c;
	        for(int f=c,x=1; x<=e; f++,x++)
	            for(int g=c,y=1; y<=e; g++,y++)
	                mat[f][g]=1;

			//e o ponto central contém o valor 4
			mat[meio][meio] = 4;
			
			//MATRIZ[LINHA][COLUNA]
			for(lin=0; lin<t; lin++){
				for(col=0; col<t; col++)
					System.out.printf("%d",mat[lin][col]);
				System.out.printf("\n");
			}
			System.out.println();
		}
		sc.close();
	}
}