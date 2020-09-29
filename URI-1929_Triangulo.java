/*-------------------*
| Rodrigo CavanhaMan |
| URI 1929           |
| Triângulo          |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
	
	    int A, B, C, D;
	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();
	    
	    if ((A < (B+C)) && (A > Math.abs(B-C)) ||
	    	(A < (B+D)) && (A > Math.abs(B-D)) ||
	    	(A < (C+D)) && (A > Math.abs(C-D)) ||
   	    	(B < (A+C)) && (B > Math.abs(A-C)) ||
	    	(B < (A+D)) && (B > Math.abs(A-D)) ||
	    	(B < (C+D)) && (B > Math.abs(C-D)) ||
  	    	(C < (A+B)) && (C > Math.abs(A-B)) ||
  	    	(C < (A+D)) && (C > Math.abs(A-D)) ||
	    	(C < (B+D)) && (C > Math.abs(B-D)) ||
	    	(D < (A+B)) && (D > Math.abs(A-B)) ||
	    	(D < (A+C)) && (D > Math.abs(A-C)) ||
	    	(D < (B+C)) && (D > Math.abs(B-C)))
	        System.out.println("S");
	    else
	        System.out.println("N");

		sc.close();
	}
}