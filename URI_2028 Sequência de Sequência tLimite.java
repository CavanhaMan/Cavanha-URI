/*-------------------------------*
| Rodrigo CavanhaMan             |
| URI 2028                       |
| Sequencia de Sequencia tLimite |
*--------------------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    int conta=0;
	    while(sc.hasNext()){
		   int n = sc.nextInt();
		   if (n>=0 && n<=200){
		        int num = 1;
		        conta++;
		        num += n*(n+1)/2;
		        if (n == 0)
		        	System.out.printf("Caso %d: %d numero\n", conta, num);
		        else 
		        	System.out.printf("Caso %d: %d numeros\n", conta, num);
		        
		        System.out.printf("0");
		        
		        for (int i=1; i<=n; i++)
		            for(int j=1; j<=i; j++)
		            	System.out.printf(" %d", i);
		        
		        System.out.printf("\n\n");
		    }
	    }
		sc.close();
	}
}	