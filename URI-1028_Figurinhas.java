/*
+--------------------+
| Rodrigo CavanhaMan |
|      BEE 1028      |
|     FigBEEnhas     |
+--------------------+
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int menor = Math.min(a,b);
			int result = figBEEnha(a,b,menor);
			System.out.println(result);
		}
		sc.close();
	}

	private static int figBEEnha(int a, int b, int menor) {
		if(a%menor==0 && b%menor==0)
			return menor;
		else{
			menor--;
			return figBEEnha(a,b,menor);
		}
	}
}