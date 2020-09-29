/*-------------------*
| Rodrigo CavanhaMan |
| URI 2497           |
| Contando Ciclos    |
*--------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int exp=0;
		while(n!=-1) {
			exp++;
			int a;
			if(n%2==0)
				a=n/2;
			else
				a=(n-1)/2;
			System.out.printf("Experiment %d: %d full cycle(s)\n",exp,a);
			n=sc.nextInt();
		}
		sc.close();
	}
}