/*
+---------------------+
|Rodrigo CavanhaMan   |
|URI 2775             |
|Preparando a Producao|
+---------------------+
*/
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			//quantidade de pacotes
			int N = Integer.parseInt(sc.nextLine());
			
			//numeros dos pacotes, na ordem da entrega
			String entrada1 = sc.nextLine();
			String[] entr1 = entrada1.split(" ");
			int[] numPac = new int[N];
			for (int i=0 ; i<N ; i++) 
				numPac[i] = Integer.parseInt(entr1[i]);
	
			
			//tempo, em segundos, que o n-esimo pacote leva para ser trocado de lugar
			String entrada2 = sc.nextLine();
			String[] entr2 = entrada2.split(" ");
			int[] tempo = new int[N];
			for (int i=0 ; i<N ; i++)
				tempo[i] = Integer.parseInt(entr2[i]);


			int custo=0;
			int auxp=0;
			int auxs=0;
			
			boolean fim=true;
			//so troca dois a dois e se estiverem um do lado do outro
			while(fim) {
				int aux=custo;
				for (int i=0 ; i<N-1 ; i++) {
					if (numPac[i]>numPac[i+1]) {
						
						auxp=numPac[i];
						numPac[i]=numPac[i+1];
						numPac[i+1]=auxp;
						
						auxs=tempo[i];
						tempo[i]=tempo[i+1];
						tempo[i+1]=auxs;
						
						custo+=tempo[i]+tempo[i+1];
					}
				}
				if (aux==custo){
					System.out.println(custo);
					fim=false;
				}
			}
		}
		sc.close();
	}
}