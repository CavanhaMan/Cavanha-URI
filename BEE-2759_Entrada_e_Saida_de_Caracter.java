/*----------------------------*
| Rodrigo CavanhaMan          |
| URI 2759                    |
| Entrada e Saída de Caracter |
*-----------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);//2
		char b = sc.next().charAt(0);//3
		char c = sc.next().charAt(0);//4
/* 05 */System.out.printf("A = %c, B = %c, C = %c\n",a,b,c);
/* 06 */System.out.printf("A = %c, B = %c, C = %c\n",b,c,a);
/* 07 */System.out.printf("A = %c, B = %c, C = %c\n",c,a,b);
		sc.close();
	}
}