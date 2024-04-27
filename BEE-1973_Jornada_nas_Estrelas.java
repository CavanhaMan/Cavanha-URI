/*---------------------*
| Rodrigo CavanhaMan   |
| URI 1973             |
| Jornada nas Estrelas |
*----------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		long soma_visita=0, soma_ovelha=0;
		long N = sc.nextInt(); //numero de estrelas
		int x;
		long[] carneiros = new long[(int) N];
		long[] estrelas  = new long[(int) N];
		
		for(x=0 ; x<N ; x++) {
			carneiros[x] = sc.nextInt(); //entra quantidade de carneiros
			estrelas[x]=0;
		}
		x=0;
		while(true){
	        if(x==0 && carneiros[x]%2==0){
	            estrelas[x]=1;
	            if(carneiros[x]>0)
	                carneiros[x]--;
	            break;
	        }
	        else if(x==N-1 && carneiros[x]%2==1){
	            estrelas[x]=1;
	            if(carneiros[x]>0)
	                carneiros[x]--;
	            break;
	        }
	        else if(carneiros[x]%2==1){
	            carneiros[x]--;
	            estrelas[x]=1;
	            x++;
	        }
	        else if(carneiros[x]%2==0){
	            estrelas[x]=1;
	            if(carneiros[x]>0)
	                carneiros[x]--;
	            x--;
	        }
	    }

	    for(x=0; x<N; x++){
	        soma_ovelha += carneiros[x];
	        soma_visita += estrelas[x];
	    }
		System.out.printf("%d %d\n", soma_visita, soma_ovelha);
		
		sc.close();
	}
}