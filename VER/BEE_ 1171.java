import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*----------------------*
| Rodrigo CavanhaMan    |
| URI 1171              |
| Frequencia de Numeros |
*-----------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		List<Integer> lista = new ArrayList<Integer>();
		
		int entrada=sc.nextInt();
		while(entrada-->0)
			lista.add(sc.nextInt());
		
		lista.forEach(System.out::print);
		System.out.println(lista);
		
		Collections.sort(lista);	// ordena a lista
		
		System.out.println(lista);
		
		
		int tamanho = lista.size();

		int[][] saida = new int[tamanho][];
		int x = 0;
		
		
		//if(!lista.contains(lista)){
		
		
		/*for (int i=0 ; i<lista.size() ; i++) {
			if (x<
		}*/
			
		
		sc.close();
	}
}
