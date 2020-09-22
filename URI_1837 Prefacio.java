/*-------------------*
| Rodrigo CavanhaMan |
| URI 1837           |
| Prefacio           |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int a, b, x, y=0, q, r;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a<0){
			x=b;
			if(b<0) x=b*-1;
			for(r=0; r<x; r++){
				y=a-r;
				if(y%b==0) break;
			}
			q=y/b;
		}
		else{
			q=a/b;
			r=a%b;
		}
		//q = (a/b);
		//r = a-(q*b);
		
		System.out.printf("%d %d\n",q,r);
		
		sc.close();
	}
}