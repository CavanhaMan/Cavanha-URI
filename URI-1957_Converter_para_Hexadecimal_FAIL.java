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
		
		int resto, i;
		char aux;
		int decimal = sc.nextInt();
		String[] hexa = new String[20];
		for (i=0 ; i<decimal ; i++){
			resto = decimal % 16;
			decimal /=16;
			if (resto<=9) hexa[i]=""+(resto+48);//hexa[i]=(char)(resto+48);
			else if (resto==10) hexa[i]="A";
			else if (resto==11) hexa[i]="B";
			else if (resto==12) hexa[i]="C";
			else if (resto==13) hexa[i]="D";
			else if (resto==14) hexa[i]="E";
			else if (resto==15) hexa[i]="F";
		}
		for (int x=0 ; x<hexa.length ; x++)
			System.out.printf("%s", hexa[x]);
		System.out.println();
		
		sc.close();
	}
}	