/*--------------------------------------*
| Rodrigo CavanhaMan                    |
| URI 2766                              |
| Entrada e Saída Lendo e Pulando Nomes |
*---------------------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//DD/MM/AA
		String[] a = new String[10];
		for(int i=0 ; i<10 ; i++)
			a[i] = sc.nextLine();
		System.out.printf("%s\n%s\n%s\n",a[2],a[6],a[8]);
		sc.close();
	}
}