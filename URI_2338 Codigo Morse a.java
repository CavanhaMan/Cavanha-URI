/*-------------------*
| Rodrigo CavanhaMan |
| URI 2338           |
| Codigo Morse a     |
| (Enigma Maratona)  |
*--------------------*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Map<String, String> morse = new HashMap<String, String>();

        morse.put(".-","A");
        morse.put("-...","B");
        morse.put("-.-.","C");
        morse.put("-..","D");
        morse.put(".","E");
        morse.put("..-.","F");
        morse.put("--.","G");
        morse.put("....","H");
        morse.put("..","I");
        morse.put(".---","J");
        morse.put("-.-","K");
        morse.put(".-..","L");
        morse.put("--","M");
        morse.put("-.","N");
        morse.put("---","O");
        morse.put(".--.","P");
        morse.put("--.-","Q");
        morse.put(".-.","R");
        morse.put("...","S");
        morse.put("-","T");
        morse.put("..-","U");
        morse.put("...-","V");
        morse.put(".--","W");
        morse.put("-..-","X");
        morse.put("-.--","Y");
        morse.put("--..","Z");
        morse.put("-----","0");
        morse.put(".----","1");
        morse.put("..---","2");
        morse.put("...--","3");
        morse.put("....-","4");
        morse.put(".....","5");
        morse.put("-....","6");
        morse.put("--...","7");
        morse.put("---..","8");
        morse.put("----.","9");
        morse.put(".-.-","Ä");
        morse.put(".--.-","Á");
        morse.put(".--.-","Å");
        morse.put("----","Ch");
        morse.put("..-..","É");
        morse.put("--.--","Ñ");
        morse.put("---.","Ö");
        morse.put("..--","Ü");
        morse.put(".-.-.-",".");
        morse.put("--..--",",");
        morse.put("---...",":");
        morse.put("..--..","?");
        morse.put(".----.","’");
        morse.put("-....-","-");
        morse.put("-..-.","\\");
        morse.put("-.--.-","(");
        morse.put(".-..-.","\"");
        morse.put(".--.-.","@");
        morse.put("-...-","=");

        int t = Integer.parseInt(sc.nextLine());
		for (int x=0 ; x<t ; x++){
			String entrada = sc.nextLine();
			String saida = "";
			//char[] codmorse = new char [entrada.length()];
			//codmorse = entrada.toCharArray();
			
            //getKey() - recupera a chave do mapa 
			//getValue() - recupera o valor do mapa

			for(int i=0; i<entrada.length(); i++){
				if (morse.containsKey(entrada)){
					saida += morse.values();
					entrada = entrada.replaceFirst(entrada,"");
				}

			}
				
			System.out.println(saida);
		}
		sc.close();
	}
}