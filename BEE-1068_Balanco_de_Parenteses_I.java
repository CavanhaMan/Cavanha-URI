/*----------------------*
| Rodrigo CavanhaMan    |
| URI 1068              |
| Balanco de Parenteses |
*-----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int troca=1;
			String parenteses="";
			parenteses = sc.nextLine();
			parenteses = parenteses.replaceAll("[^(e)]","");
				
			while(troca==1){
				if(parenteses.indexOf("()") != -1) //Se for diferente de -1 é pq existe o caracter.
					parenteses = parenteses.replaceFirst("\\(\\)","");
					//System.out.println(parenteses);
				else
					troca=0;
			}

			if(parenteses.indexOf("(") != -1 || parenteses.indexOf(")") != -1)
				System.out.println("incorrect");
			else
				System.out.println("correct");
		}
		sc.close();
	}
}