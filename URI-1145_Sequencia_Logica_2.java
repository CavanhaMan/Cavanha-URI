/*-------------------*
| Rodrigo CavanhaMan |
| URI 1145           |
| Sequencia Logica   |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x, y, auxx=0, auxy; 
		
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y){
			int z = x;
			x = y;
			y = z;
		}
		
		for (auxy = 1; auxy <= y; auxy++){
			System.out.printf("%d ",auxy);
			auxx++;
			if (auxx == (x-1)){
				auxx = 0;
				auxy++;
				System.out.printf("%d\n",auxy);
			}
		}
		sc.close();
	}
}