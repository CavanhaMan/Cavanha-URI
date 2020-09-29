/*-------------------*
| Rodrigo CavanhaMan |
| URI 2143           |
| A Vota do Radas    |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int T = 1,N,ponta=0;
		
		while (T!=0){
			T = sc.nextInt();
			if (T>0 && T<=100){
				for (int i=0 ; i<T ; i++){
					N = sc.nextInt();
					if ((N-2)%2==0)
						ponta=2;
					else if ((N-1)%2==0)
						ponta=1;
					System.out.println((N-ponta)*2+ponta);
				}
			}
		}
		sc.close();
	}

	
}