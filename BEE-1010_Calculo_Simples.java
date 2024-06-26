/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1010      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int cod1,num1,cod2,num2;
		double vlr1,vlr2,vlrpagar;
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		vlr2 = sc.nextDouble();

		vlrpagar = (num1*vlr1)+(num2*vlr2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", vlrpagar);
		
		sc.close();
	}
}

