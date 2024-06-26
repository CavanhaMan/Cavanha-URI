/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1176      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t, n;
		long[] fib = new long[61];

		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= 60; i++)
			fib[i] = fib[i-1] + fib[i-2];
		
		t = sc.nextInt();
		while (t>0){
			n = sc.nextInt();
			System.out.printf("Fib(%d) = %d\n",n,fib[n]);
			t--;
		}
		sc.close();
	}
}