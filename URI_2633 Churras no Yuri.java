/*-------------------*
| Rodrigo CavanhaMan |
| URI 2633           |
| Churras no Yuri    |
*--------------------*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){	    
		    String entrada="", saida="";
		    Map<Integer,String> churras = new HashMap<Integer,String>();
		    int n = Integer.parseInt(sc.nextLine());
			for (int i=0 ; i<n ; i++){
					entrada = sc.nextLine();
		            int espaco = entrada.indexOf(" ");
		            String value = entrada.substring(0,espaco);
		            Integer key = Integer.parseInt(entrada.substring(espaco+1));
		            churras.put(key,value);
		        }
		    	Map<Integer, String> treeMap = new TreeMap<Integer, String>(churras);//ordena o map
		    	for (String x: treeMap.values())
		    		saida+=x+" ";
					//System.out.printf("%s ",x);
		    	saida = saida.substring(0, saida.length()-1);
				System.out.println(saida);
		}
		sc.close();
	}
}
