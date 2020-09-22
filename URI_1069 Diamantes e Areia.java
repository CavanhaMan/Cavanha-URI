/*-------------------*
| Rodrigo CavanhaMan |
| URI 1069           |
| Diamantes e Areia  |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for (int y=0 ; y<N ; y++){
			int contaDiamante=0, troca=1;
			String diamante="";
			diamante = sc.nextLine();
		
			diamante = diamante.replaceAll("[.]","");
			//System.out.println(diamante);
				
			while(troca==1){
				if(diamante.indexOf("<>") != -1){ //Se for diferente de -1 é pq existe o caracter.
					contaDiamante++;
					diamante = diamante.replaceFirst("<>","");
				}
				else
					troca=0;
			}
			System.out.println(contaDiamante);
		}
		sc.close();
	}

}