/*---------------------------*
| Rodrigo CavanhaMan         |
| URI 1962                   |
| Ha Muito Muito Tempo Atras |
*----------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++){
			int t = sc.nextInt();
			if(t<2015)
				System.out.println(2015-t + " D.C.");
			else
				System.out.println(t-2014 + " A.C.");
		}
		
		sc.close();
	}
}