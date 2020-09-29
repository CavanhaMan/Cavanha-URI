/*----------------------*
| Rodrigo CavanhaMan    |
| URI 1171              |
| Frequencia de Numeros |
*-----------------------*/
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int entrada=sc.nextInt();
		while(entrada-->0)
			lista.add(sc.nextInt());
		
		SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
		lista.forEach(id -> contaQuant.compute(id, (chave, valor) -> (valor == null ? 1 : valor + 1)));
		
		//System.out.println(idQuantidade);
		contaQuant.entrySet().forEach(entry->{
			System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());  
		});
		
		sc.close();
	}
}
