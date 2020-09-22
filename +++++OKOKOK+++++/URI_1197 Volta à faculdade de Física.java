/*
+-----------------------------+
|     Rodrigo CavanhaMan      |
|             1197            |
| Volta à faculdade de Física |
+-----------------------------+
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int v = sc.nextInt();
			int t = sc.nextInt();
			System.out.println(v*(2*t));
		}
		sc.close();
	}
}