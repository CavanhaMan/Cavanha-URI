/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║      BEE 1533      ║
║      Detetive      ║
╚════════════════════╝
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		while(n!=0){
			int[] x = new int[n];
					
			for (int i=0 ; i<n ; i++)
				x[i] = sc.nextInt();

			int Maior = x[0];
			int posMaior = 0; 
			for (int i=1 ; i<n ; i++)
				if (Maior<=x[i]){
					Maior=x[i];
					posMaior=i;
				}
			x[posMaior]=0;
				
			Maior = x[0];
			posMaior = 0; 
			for (int i=1 ; i<n ; i++)
				if (Maior<=x[i]){
					Maior=x[i];
					posMaior=i;
				}
			
			System.out.println(posMaior+1);
			n = sc.nextInt();
		}
		sc.close();
	}
}