/*
+--------------------+
| Rodrigo CavanhaMan |
|      URI 2720      |
| Presentes  Grandes |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		
		int t = sc.nextInt(); //num de casos
		for(int a=0 ; a<t ; a++) {
			int n=0; //num presentes papai noel
			int k=0; //num presentes do bruninho
			int i=0, h=0, w=0, l=0;
			int volume=0; //id, altura, largura, comprimento
			n = sc.nextInt(); //num presentes papai noel
			k = sc.nextInt(); //num presentes do bruninho
			for(int b=0 ; b<n ; b++) {
				i = sc.nextInt();
				h = sc.nextInt();
				w = sc.nextInt();
				l = sc.nextInt();
				volume = h * w * l;
			}
		}
	}
}
