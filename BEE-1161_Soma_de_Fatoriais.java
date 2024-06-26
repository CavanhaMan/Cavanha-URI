/*
╔═════════════════════╗
║ Rodrigo CavanhaMan  ║
║      BEE 1161       ║
║  Soma de Fatoriais  ║
╚═════════════════════╝
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(calculaFatorial(n)+calculaFatorial(m));
		}
		sc.close();
	}

	private static long calculaFatorial(int n) {
		long fat=1;
		for (int aux = n; aux > 0; aux--)
			fat = fat * aux;
		return fat;
	}
}