/*---------------------------------*
| Rodrigo CavanhaMan               |
| URI 2338                         |
| Codigo Morse qualquer quantidade |
*----------------------------------*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Map<String, String> morse = new HashMap<String, String>();

    	morse.put(".=","a");
    	morse.put("=.===","a");
    	morse.put("=.===","a");
    	morse.put("===.=.=.=","b");
    	morse.put("===.=.===.=","c");
    	morse.put("===.=.=","d");
    	morse.put("=","e");
    	morse.put("=.=.===.=","f");
    	morse.put("===.===.=","g");
    	morse.put("=.=.=.=","h");
    	morse.put("=.=","i");
    	morse.put("=.===.===.===","j");
    	morse.put("===.=.===","k");
    	morse.put("=.===.=.=","l");
    	morse.put("===.===","m");
    	morse.put("===.=","n");
    	morse.put("===.===.===","o");
    	morse.put("=.===.===.=","p");
    	morse.put("===.===.=.===","q");
    	morse.put("=.===.=","r");
    	morse.put("=.=.=","s");
    	morse.put("===","t");
    	morse.put("=.=.===","u");
    	morse.put("=.=.=.===","v");
    	morse.put("=.===.===","w");
    	morse.put("===.=.=.===","x");
    	morse.put("===.=.===.===","y");
    	morse.put("===.===.=.=","z");
    	
		while (sc.hasNext()){
	    	String saida = "";
			String entrada = sc.nextLine();
			String[] palavras = entrada.split("\\.\\.\\.\\.\\.\\.\\.");
			
			for (int i=0 ; i<palavras.length ; i++){
				String[] letras = palavras[i].split("\\.\\.\\.");
				for (int y=0 ; y<letras.length ; y++)
					if (morse.containsKey(letras[y]))
						saida+=morse.get(letras[y]);
						//System.out.printf(morse.get(letras[y]));
				saida+=" ";
			}
			saida = saida.substring(0, saida.length()-1);
			System.out.println(saida);
		}
		sc.close();
	}
}