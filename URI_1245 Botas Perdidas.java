/*-------------------*
| Rodrigo CavanhaMan |
| URI 1245           |
| Botas Perdidas     |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()){
			int max=61;
			int D[] = new int[max];
			int E[] = new int[max];
			
			int N = sc.nextInt();
			int cont = 0;
			if(N>=2 && N<=10000 && N%2==0){
				for (int i=0 ; i<N ; i++){
					int M = sc.nextInt();
					char L = sc.next().charAt(0);
					if (L == 'D'){
						D[M]++;
						if (E[M]>0){
							E[M]--;
							D[M]--;
							cont++;
						}
					}
					else{
						E[M]++;
						if (D[M]>0){
							D[M]--;
							E[M]--;
							cont++;
						}
					}
				}
				System.out.println(cont);
			}
		}
		sc.close();
	}
}