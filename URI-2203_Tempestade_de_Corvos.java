/*---------------------*
| Rodrigo CavanhaMan   |
| URI 2203             |
| Tempestade de Corvos |
*----------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1, y1, x2, y2, v, r1, r2;
		while(sc.hasNext()){
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			v  = sc.nextInt();
			r1 = sc.nextInt();
			r2  = sc.nextInt();
		
			int X = (x2-x1)*(x2-x1);
	        int Y = (y2-y1)*(y2-y1);
	        double discancia = Math.sqrt(X+Y);
	        discancia += v*1.50;
	        double alcance = r1+r2;
	        if(discancia > alcance) System.out.println("N");
	        else System.out.println("Y");
		}
		sc.close();
	}	
}