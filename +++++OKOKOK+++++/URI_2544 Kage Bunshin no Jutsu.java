/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 2544      |
+--------------------+
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int total = sc.nextInt();
			int conta=0;
			while(total!=1) {
				if (total%2==0) {
					total/=2;
					conta++;
				}
				else
					return;
			}
			System.out.println(conta);
		}
		sc.close();
	}
}
