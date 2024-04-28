/*------------------*
|Rodrigo CavanhaMan |
|URI 2770           |
|Tamanho da Placa   |
*-------------------*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String entrada1 = sc.nextLine();
			String[] entr1 = entrada1.split(" ");
			int X = Integer.parseInt(entr1[0]);
			int Y = Integer.parseInt(entr1[1]);
			int M = Integer.parseInt(entr1[2]);
			
			for (int i=0 ; i<M ; i++) {
				String entrada2 = sc.nextLine();
				String[] entr2 = entrada2.split(" ");
				int x1 = Integer.parseInt(entr2[0]);
				int y1 = Integer.parseInt(entr2[1]);

				if ((x1<=X && y1<=Y) || (x1<=Y && y1<=X))
					System.out.println("Sim");
				else
					System.out.println("Nao");
			}
		}
		sc.close();
	}
}