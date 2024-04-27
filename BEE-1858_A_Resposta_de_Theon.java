/*--------------------*
| Rodrigo CavanhaMan  |
| URI 1858            |
| A Resposta de Theon |
*---------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, menor,pos=0;
		n = sc.nextInt();
		int[] t = new int[n];
		
		for (int i=0 ; i<n ; i++)
			t[i] = sc.nextInt();
		
		menor=t[0];
		for (int i=0 ; i<n ; i++)
			if (menor > t[i]){
				menor=t[i];
				pos=i;
			}
		
		System.out.println(pos+1);
		sc.close();
	}
}