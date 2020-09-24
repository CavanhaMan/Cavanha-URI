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
		
		int n = sc.nextInt(); //numero de estrelas
		int[] carneiros = new int[n];
		for(int i=0 ; i<n ; i++)
			carneiros[i] = sc.nextInt(); //entra quantidade de carneiros
		
		boolean continua=true;
		while(continua){
			int i=0;
			if (carneiros[i]%2==0)
				carneiros[i]--;
			else
				carneiros[i]++;
				
			
		}
			//aqui ele rouba um carneiro
			//aqui ele vê se tem carneiros par ou impar
		//se for par, vai pro próximo sitio
		//se for impar, vai pro sítio anterior
		//se nao tem outra estrela, FIM!
		
		sc.close();
	}
}