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
		
		int i=0;
		int n = sc.nextInt(); //numero de estrelas
		long[] carneiros = new long[n];
		long[] sitio = new long[n];
		long ataques=0, contaCarneiros=0;
		
		for(int x=0 ; x<n ; x++) {
			carneiros[x] = sc.nextInt(); //entra quantidade de carneiros
			sitio[i]=0;
		}
		i=0;
		while(true){
			//aqui ele vê se tem carneiros par ou impar
	        if(i==0 && carneiros[i]%2==0){ //par
	            sitio[i]=1;
	            if(carneiros[i]>0)	carneiros[i]--;
	            break;
	        }
	        else if(i==n-1 && carneiros[i]%2==1){ //impar
	            sitio[i]=1;
	            if(carneiros[i]>0)	carneiros[i]--;
	            break;
	        }

			if (carneiros[i]%2!=0) {	//se for impar, vai pro próximo sitio
				sitio[i]=1;
				carneiros[i]--; //aqui ele rouba um carneiro
				i++; //conta 1 sitio visitado
			}
			else {			//se for par, vai pro sítio anterior
				sitio[i]=1;
				carneiros[i]--;
				i--;
			}
		}
		for(int x=0 ; x<n ; x++){
			contaCarneiros+=carneiros[x];
			ataques+=sitio[x];
		}
			
		System.out.printf("%d %d",ataques,contaCarneiros);
		
		sc.close();
	}
}