/*-------------------*
| Rodrigo CavanhaMan |
| URI 2554           |
| Pizza Antes de BH  |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			String[] P = sc.nextLine().split(" ");
			int N = Integer.parseInt(P[0]); //numero de pessoas
			int D = Integer.parseInt(P[1]); //datas consideradas
			int soma=0, c=0;
			String[] entrada = new String[N+1];
			
			for(int x=0 ; x<D ; x++) {
				soma=0;
				entrada = sc.nextLine().split(" ");
				//data[0][x] = Integer.toString(x);
				for (int i=1 ; i<entrada.length ; i++)
					if (entrada[i].equals("1"))
						soma++;
				if (soma==N && c!=1) {
					System.out.println(entrada[0]);
					c=1;
				}
			}
			if (c==0)
				System.out.println("Pizza antes de FdI");
		}
		sc.close();
	}
}
