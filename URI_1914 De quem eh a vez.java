/*-------------------*
| Rodrigo CavanhaMan |
| URI 1914           |
| De quem é a vez?   |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0 ; i<n ; i++){
			String j1 = sc.next();
			String a1 = sc.next();
			String j2 = sc.next();
			String a2 = sc.next();
			int v1 = Integer.parseInt(sc.next());
			int v2 = Integer.parseInt(sc.next());
			String res;
			if((v1+v2)%2==0)
				res = "PAR";
			else
				res = "IMPAR";
			if(a1.equals(res))
				System.out.println(j1);
			else if(a2.equals(res))
				System.out.println(j2);
			else
				System.out.println("EMPATE");
			}
		
		sc.close();
	}
}
