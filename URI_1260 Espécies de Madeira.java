/*--------------------*
| Rodrigo CavanhaMan  |
| URI 1260            |
| Especies de Madeira |
*---------------------*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static Map<String, Integer> arvores = new HashMap<>();
	static Integer cont = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.nextLine();		
		while (sc.hasNext()) {
			String linha = sc.nextLine();
			if (linha.equals("")) {					
				processarArvore();
				if (cont != 0)
					System.out.println("");	
				
				arvores=new HashMap<>();
				cont=0;	
			}
			else {
				if (arvores.containsKey(linha)) {
					Integer valor = arvores.get(linha);
					valor++;
					arvores.put(linha, valor);
				}
				else
					arvores.put(linha,1);
				cont++;
			}
		}
		processarArvore();
	}

	private static void processarArvore() {
		if (arvores.keySet().size() == 0)
			return;

		List<String> arvoresOrdenadas = new ArrayList<>(arvores.keySet());
		Collections.sort(arvoresOrdenadas);
		for (String arvoreOrdenada: arvoresOrdenadas) {
			Integer valor = arvores.get(arvoreOrdenada);
			Double resposta = valor.doubleValue() / cont.doubleValue() * 100d;
			System.out.printf(arvoreOrdenada+" %.4f\n",resposta);
		}		
	}
}