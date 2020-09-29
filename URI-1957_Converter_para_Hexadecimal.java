/*---------------------------*
| Rodrigo CavanhaMan         |
| URI 1957                   |
| Converter para Hexadecimal |
*----------------------------*/
//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));
		
	    String hex = "";
	    int num=sc.nextInt();

	    while (num != 0){
	        if (num % 16 < 10)
	            hex = Integer.toString(num % 16) + hex;
	        else
	            hex = (char)((num % 16)+55) + hex;
	        num = num / 16;
	    }
		System.out.printf("%s\n", hex);
		
		sc.close();
	}
}	