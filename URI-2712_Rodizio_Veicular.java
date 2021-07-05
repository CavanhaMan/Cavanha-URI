/*-------------------*
| Rodrigo CavanhaMan |
| URI 2712           |
| Rodizio Veicular   |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			//AAA-9999
			for(int x=0 ; x<n ; x++) {
				String[] s = new String[8];
				String placa = sc.nextLine();
				if (placa.matches("[A-Z]{3}(-)\\d{4}")) {
					s = placa.split("");
					if (s[7].equals("1") || s[7].equals("2")) System.out.println("MONDAY");
					if (s[7].equals("3") || s[7].equals("4")) System.out.println("TUESDAY");
					if (s[7].equals("5") || s[7].equals("6")) System.out.println("WEDNESDAY");
					if (s[7].equals("7") || s[7].equals("8")) System.out.println("THURSDAY");
					if (s[7].equals("9") || s[7].equals("0")) System.out.println("FRIDAY");
				}
				else
					System.out.println("FAILURE");
			}
		}
		sc.close();
	}
}
/*
		String[] s = new String[2];
		if (placa.contains("-"))
			s = placa.split("-");
		else
			System.out.println("FAILURE");
		//012-4567
		if (s[1].matches("\\d{4}"))
            System.out.println("is a number");
        else
            System.out.println("FAILURE");

		if (s[0].matches("[A-Z]{3}"))
            System.out.println("is a letter");
        else
            System.out.println("FAILURE");
*/