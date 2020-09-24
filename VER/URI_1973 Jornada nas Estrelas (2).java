/*
+------------------+
|Rodrigo CavanhaMan|
|     URI 1973     |
+------------------+
Jornada nas Estrelas
*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int visita=0;
		int sitio=0;
		long rouba=0, resto=0;
		int n = sc.nextInt(); //numero de estrelas
		long[] carneiros = new long[n];
		
		for(int x=0 ; x<n ; x++) {
			carneiros[x] = sc.nextInt(); //entra quantidade de carneiros
			resto+=carneiros[x];
		}
		while(carneiros[sitio]>0 && sitio<n && sitio>=0){
			//aqui ele rouba um carneiro
			carneiros[sitio]--;
			rouba++;
			visita++;
			//aqui ele vê se tem carneiros par ou impar
			if (carneiros[sitio]%2!=0 && carneiros[sitio]>0 && sitio<=n && sitio>=0)	//se for impar, vai pro próximo sitio
				sitio++;
			else if (carneiros[sitio]>0 && sitio<=n && sitio>=0)					//se for par, vai pro sítio anterior
				sitio--;
			//se nao tem outra estrela, FIM!
		}
		int somatudo=0;
		for(int x=0 ; x<n ; x++)
			somatudo+=carneiros[x];

		System.out.printf("%d %d",visita,somatudo);
		
		sc.close();
	}
}