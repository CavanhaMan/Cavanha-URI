/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 2062      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int N, cont;
		String s[];

		N = sc.nextInt();
		s = new String[N];

		for (int i = 0; i < N; i++)
			s[i] = sc.next();

		for (int i = 0; i < N; i++) {
			cont = s[i].length();
			if (cont == 3)
				if ((s[i].charAt(0) == 'O' && s[i].charAt(1) == 'B') || (s[i].charAt(0) == 'U' && s[i].charAt(1) == 'R')) {
					if (s[i].charAt(0) == 'O' && s[i].charAt(1) == 'B')
						s[i] = "OBI";
					else
						s[i] = "URI";
				}
		}

		for (int i = 0; i < N; i++) {
			if (i != N - 1)
				System.out.print(s[i] + " ");
			else
				System.out.println(s[i]);
		}
		sc.close();
	}

}
