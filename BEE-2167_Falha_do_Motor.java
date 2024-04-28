/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 2167      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n = sc.nextInt();
		int motor0=0,motorn=0;
		int queda=0;
		
		for (int i=0 ; i<n ; i++){
			motorn = sc.nextInt();
			if (motorn < motor0){
				queda=i+1;
				i=n;
			}
			motor0=motorn;				
		}
			
		System.out.println(queda);
		sc.close();
	}
	
}