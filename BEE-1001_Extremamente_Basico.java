/*-------------------*
| Rodrigo CavanhaMan |
| URI 1001           |
| Extremante Basico  |
*--------------------*/
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			
			int A, B, X;
			
			A = sc.nextInt();
			B = sc.nextInt();
			X = A + B;
			System.out.println("X = " + X);
			
			sc.close();
		}

	}
