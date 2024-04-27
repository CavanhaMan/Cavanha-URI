/*-------------------*
| Rodrigo CavanhaMan |
| URI 1983           |
| O Escolhido        |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] aluno = new int[n];
		double[] nota = new double[n];
		int minimum=0;
		for(int i=0 ; i<n ; i++){
			aluno[i] = sc.nextInt();
			nota[i] = sc.nextDouble();
			if(nota[i]>=8.0)
				minimum=1;
		}
		if(minimum==1){
			double max=nota[0];
			int maior=0;
			for(int i=1 ; i<n ; i++){
				if(max<nota[i]){
					max=nota[i];
					maior=i;
				}
			}
			System.out.println(aluno[maior]);
		}
		else
			System.out.println("Minimum note not reached");
		sc.close();
	}
}