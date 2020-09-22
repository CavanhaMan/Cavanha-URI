/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1253      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		for (int i=0 ; i<N ; i++){
			sc.nextLine();
			String str = sc.nextLine();
			int troca=sc.nextInt();
			char[] s = str.toCharArray();
			for (int x=0 ; x<s.length ; x++){
				if((s[x]-troca) < 65)
					s[x]+=(26-troca);
				else
					s[x]-=troca;
			}
			System.out.println(s);
		}
		sc.close();
	}
}