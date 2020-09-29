/*-------------------*
| Rodrigo CavanhaMan |
| URI 1087           |
| DAMA               |
*--------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int x1,y1,x2,y2;
		//se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
		//se estiver em qualquer outra posição, a rainha gastará 2 movimentos!
	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
	    	if(x1 == x2 && y1 == y2)		//mesma posição
	    		System.out.println("0");
	        else if(x1 == x2 || y1 == y2)	//mesma linha ou mesma coluna
	        	System.out.println("1");
	    	else if((x2-x1)==-(y2-y1) || -(x2-x1)==-(y2-y1) || -(x2-x1)==(y2-y1) || (x2-x1)==(y2-y1))
	    		System.out.println("1");	//mesma diagonal
	        else 
	        	System.out.println("2");	//o resto...
	    }
		sc.close();
	}
}