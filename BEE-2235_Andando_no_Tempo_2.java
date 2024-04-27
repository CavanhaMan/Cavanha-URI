/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║      BEE 2235      ║
║  Andando no Tempo  ║
╚════════════════════╝
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A == B || B == C || A == C) {
			System.out.println("S");
		} else if (A+B==C || A+C==B || B+C ==A) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		sc.close();
	}
}
