/*------------------------*
| Rodrigo CavanhaMan      |
| URI 2126                |
| Procurado Subsequencias |
*-------------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String entrada;
		String frase;
		int caso=0;
	    
		while(sc.hasNext()){
			caso++;
	    	int conta=0, troca=1, pos=0;
	    	entrada = sc.nextLine();
	    	frase = sc.nextLine();
			pos = frase.lastIndexOf(entrada)+1;
	    	while(troca==1){
		    	if(frase.contains(entrada)){
					frase = frase.replaceFirst(entrada,"");
					conta++;
				}
		    	else
		    		troca=0;
	    	}
	    	System.out.printf("Caso #%d:\n",caso);
	        if(conta==0) System.out.println("Nao existe subsequencia\n");
	        else{
	            System.out.printf("Qtd.Subsequencias: %d\n", conta);
	            System.out.printf("Pos: %d\n\n",pos);
	        }
	    }
		sc.close();
	}	
}
// String s = "123456789021";
// System.out.println(java.util.Arrays.toString(s.split("(?<=\\G...)")));
// 	String[] entr = frase.split("(?<=\\G.....)");
// 	for (int i=0 ; i<entr.length ; i++)
 //		System.out.println(entr[i]);	