/*-------------------*
| Rodrigo CavanhaMan |
| URI 2162           |
| Picos e Vales      |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
	    int cndtn=1;

	    int[] medida = new int[n];
	    for(int i=0; i<n; i++)
	        medida[i] = sc.nextInt();
	    if(n==2 && medida[0]==medida[1]) cndtn = 0;
	    else{
	        for(int i=2; i<n; i++){
	        	if(medida[i]>=medida[i-1] && medida[i-1]>=medida[i-2])
	                cndtn=0;
	            else if(medida[i]<=medida[i-1] && medida[i-1]<=medida[i-2])
	                cndtn=0;
	        }
	    }
		System.out.println((cndtn==1)?"1":"0");
		sc.close();
	}
	
}	