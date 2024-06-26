/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1078      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n;
		
		n = sc.nextInt();
		
		System.out.printf("1 x %d = %d\n",n,n);
		System.out.printf("2 x %d = %d\n",n,n*2);
		System.out.printf("3 x %d = %d\n",n,n*3);
		System.out.printf("4 x %d = %d\n",n,n*4);
		System.out.printf("5 x %d = %d\n",n,n*5);
		System.out.printf("6 x %d = %d\n",n,n*6);
		System.out.printf("7 x %d = %d\n",n,n*7);
		System.out.printf("8 x %d = %d\n",n,n*8);
		System.out.printf("9 x %d = %d\n",n,n*9);
		System.out.printf("10 x %d = %d\n",n,n*10);

		sc.close();
	}
}