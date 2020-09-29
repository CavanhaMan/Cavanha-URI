/*--------------------*
| Rodrigo CavanhaMan  |
| URI 1795            |
| Triângulo Trinomial |
*---------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		System.out.printf("%.0f\n",Math.pow(3,n));
		sc.close();
	}
}