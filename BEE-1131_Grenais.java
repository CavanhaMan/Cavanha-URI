/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1131      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int inter=0, gremio=0, somainter=0, somagremio=0, empate=0;
		int stop = 1, grenais=0;

		while (stop != 2){
			if (stop == 1){
				grenais = grenais + 1;
				inter = sc.nextInt();
				gremio = sc.nextInt();
				if (inter > gremio){
					somainter = somainter + 1;
				}
				else if (inter < gremio){
					somagremio = somagremio + 1;
				}
				else if (inter == gremio){
					empate = empate + 1;
				}
				System.out.println("Novo grenal (1-sim 2-nao)");
				stop = sc.nextInt();
			}
			if (stop == 2){
				System.out.printf("%d grenais\n",grenais);
				System.out.printf("Inter:%d\n",somainter);
				System.out.printf("Gremio:%d\n",somagremio);
				System.out.printf("Empates:%d\n",empate);
				if (somainter > somagremio){
					System.out.println("Inter venceu mais");
				}
				else{
					System.out.printf("Gremio venceu mais");
				}
			}
		}
		sc.close();
	}
}