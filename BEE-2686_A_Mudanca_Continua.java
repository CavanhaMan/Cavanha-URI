/*-------------------*
| Rodrigo CavanhaMan |
| BEE 2685           |
| Keanu              |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int m = sc.nextInt();
			
			//0-90 dia
			if ((m>=0 && m<90) || m==360)
				System.out.println("Bom Dia!!");	
			//90-180 tarde
			else if (m>=90 && m<180)
				System.out.println("Boa Tarde!!");
			//180-270 noite
			else if (m>=180 && m<270)
				System.out.println("Boa Noite!!");
			//270-360 madrugada
			else if (m>=270 && m<360)
				System.out.println("De Madrugada!!");
		
		}
		sc.close();
	}
}
//"Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!"