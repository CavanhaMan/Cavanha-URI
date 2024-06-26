/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      BEE 1038      |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int cod;
		Double quant;
		cod = sc.nextInt();
		quant = sc.nextDouble();
		
		if(cod == 1){
			System.out.printf("Total: R$ %.2f\n",(4.00*quant));	
		}
		if(cod == 2){
			System.out.printf("Total: R$ %.2f\n",(4.50*quant));	
		}
		if(cod == 3){
			System.out.printf("Total: R$ %.2f\n",(5.00*quant));	
		}
		if(cod == 4){
			System.out.printf("Total: R$ %.2f\n",(2.00*quant));	
		}
		if(cod == 5){
			System.out.printf("Total: R$ %.2f\n",(1.50*quant));	
		}

		sc.close();
	}
}