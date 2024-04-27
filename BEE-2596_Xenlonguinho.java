/*-------------------*
| Rodrigo CavanhaMan |
| URI 2596           |
| Xenlonguinho       |
*--------------------*/
import java.util.Scanner;

public class Main {
//todas as esferas cujo o número de divisores da quantidade de estrelas da esfera sejam par.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

				
		int c = sc.nextInt();
		for(int i=0 ; i<c ; i++) {
			int n = sc.nextInt();
			int contaesferas=0;
			for(int x=1 ; x<=n ; x++)
				if(contaPar(x)==1)
					contaesferas++;
			System.out.println(contaesferas);
		}
		sc.close();
	}

	private static int contaPar(int n) {
		int divisores=0;
		for (int j=1 ; j<=n ; j++)	//7-----1   8---4-21
			if(n%j==0)
				divisores++;
		if(divisores%2==0)
			return 1;
		else
			return 0;
	}
}


