/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 2146      |
+--------------------+
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int senha = sc.nextInt();
			System.out.println(senha-1);
		}
		sc.close();
	}
}