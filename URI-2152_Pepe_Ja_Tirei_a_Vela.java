/*---------------------*
| Rodrigo CavanhaMan   |
| URI 2152             |
| Pepe Já Tirei a Vela |
*----------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int C = sc.nextInt();
		int h, m, porta;
		for(int i=0 ; i<C ; i++){
			h = sc.nextInt();
			m = sc.nextInt();
			porta = sc.nextInt();
			if(porta==1)
				System.out.printf("%02d:%02d - A porta abriu!\n",h,m);
			else
				System.out.printf("%02d:%02d - A porta fechou!\n",h,m);				
		}
		sc.close();
	}
}