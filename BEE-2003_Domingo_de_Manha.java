/*-------------------*
| Rodrigo CavanhaMan |
| URI 2003           |
| Domingo de Manha   |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//x = Integer.parseInt(sc.nextLine()); 
		String horaE = "";
		
		while(sc.hasNext()){
			horaE = sc.nextLine();
			String[] entrada = horaE.split(":");
			int hora = Integer.parseInt(entrada[0]);
			int min = Integer.parseInt(entrada[1]);
			
			int total = hora*60+min;
			if (total <= 7*60)
				System.out.printf("Atraso maximo: 0\n");
			else
				System.out.printf("Atraso maximo: %d\n",((hora+1)-8)*60 + min);
		}
		sc.close();
	}
}	