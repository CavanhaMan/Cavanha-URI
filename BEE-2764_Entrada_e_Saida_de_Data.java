/*------------------------*
| Rodrigo CavanhaMan      |
| URI 2764                |
| Entrada e Saída de Data |
*-------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//DD/MM/AA
		String[] data = new String[4]; 
		data = sc.nextLine().split("/");
		System.out.printf("%s/%s/%s\n",data[1],data[0],data[2]);
		System.out.printf("%s/%s/%s\n",data[2],data[1],data[0]);
		System.out.printf("%s-%s-%s\n",data[0],data[1],data[2]);
		sc.close();
	}
}