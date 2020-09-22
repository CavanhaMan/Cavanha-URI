/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 1581               |
| Conversa Internacional |
*------------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for (int y=0 ; y<N ; y++){
			int diferentes=0;
			int quantLinguas = Integer.parseInt(sc.nextLine());
			
			String[] lingua= new String[quantLinguas];
			
			for (int i=0 ; i<quantLinguas ; i++)
				lingua[i] = sc.nextLine();

			String compara=lingua[0];
			for (int i=0 ; i<quantLinguas ; i++){
				if (compara.equals(lingua[i]))
					diferentes++;
				else
					diferentes=0;
			}

			if (diferentes==quantLinguas)
				System.out.println(lingua[0]);
			else
				System.out.println("ingles");
		}
		sc.close();
	}
}