/*-------------------*
| Rodrigo CavanhaMan |
| URI 2150           |
| Vogais Alienigenas |
*--------------------*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int valor=0, soma = 0;
			Map<Character,Integer> tabelaHash = new HashMap<>();
		
			String entrada = sc.nextLine(); 
			char[] entr = entrada.toCharArray();
			
			for (int i=0 ; i<entr.length ; i++)
				tabelaHash.put(entr[i],0);
	
			String texto = sc.nextLine();
			//String textoMinusc = texto.toLowerCase();
	
			char[] caracteres = texto.toCharArray();
			
			for (int i=0 ; i<caracteres.length ; i++){
				char caractere = caracteres[i];
				if (tabelaHash.containsKey(caractere)){
					valor = tabelaHash.get(caractere);
					valor++;
					tabelaHash.put(caractere, valor);
				}
			}
	
			for (int i=0 ; i<entr.length ; i++)
				soma += tabelaHash.get(entr[i]);
			
			//System.out.println(tabelaHash);
			System.out.println(soma);
		}
		sc.close();
	}

}