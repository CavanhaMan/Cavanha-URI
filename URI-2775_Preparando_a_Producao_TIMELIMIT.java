/*
+---------------------+
|Rodrigo CavanhaMan   |
|URI 2775             |
|Preparando a Producao|
+---------------------+
*/
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			//quantidade de pacotes
			int N = Integer.parseInt(sc.nextLine());
			
			//números dos pacotes, na ordem da entrega
			String entrada1 = sc.nextLine();
			String[] entr1 = entrada1.split(" ");
	
			int[] pac = new int[N];
			int[] check = new int[N];
			for (int i=0 ; i<N ; i++) {
				pac[i] = Integer.parseInt(entr1[i]);
				check[i] = Integer.parseInt(entr1[i]);
			}
	
			//tempo, em segundos, que o n-ésimo pacote leva para ser trocado de lugar
			String entrada2 = sc.nextLine();
			String[] entr2 = entrada2.split(" ");
			int[] sec = new int[N];
			for (int i=0 ; i<N ; i++)
				sec[i] = Integer.parseInt(entr2[i]);
			
			int custo=0;
			int auxp=0;
			int auxs=0;
			
			Arrays.sort(check);	// ordena a lista
			Object[] test1 = {check};  // arr2 also contains only one element
			boolean igual=false;
			
			while(igual == false) {
				for (int i=0 ; i<N-1 ; i++) {
					if (pac[i]>pac[i+1]) {
						
						auxp=pac[i];
						pac[i]=pac[i+1];
						pac[i+1]=auxp;
						
						auxs=sec[i];
						sec[i]=sec[i+1];
						sec[i+1]=auxs;
						
						custo+=sec[i]+sec[i+1];
					}
					Object[] test2 = {pac};  // arr1 contains only one element
			        
			        if (Arrays.deepEquals(test1, test2))
			            igual=true;
			        else
			            igual=false;
				}
			}
			System.out.println(custo);
		}
		sc.close();
	}
}
/*
só troca dois a dois e se estiverem um do lado do outro.
*/