/*-------------------------*
| Rodrigo CavanhaMan       |
| URI 1620                 |
| Triangulação de Delaunay |
*--------------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l=sc.nextDouble();
		while(l!=0) {
			double i = ((l-3)*2)+3;
			double x = (i-l)/l;
			System.out.printf("%.6f\n", x);
			l=sc.nextDouble();
		}
		sc.close();
	}
}