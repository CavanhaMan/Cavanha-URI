/*---------------------*
| Rodrigo CavanhaMan   |
| URI 1251             |
| Diga-me a Frequência |
*----------------------*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		boolean leuAlguem = false;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			if (leuAlguem) {
				System.out.println("");
			}
			leuAlguem = true;
			String entrada = sc.nextLine();
			Map<Integer, Integer> frequencia = new HashMap<>();
			for (Character c: entrada.toCharArray()) {
				Integer quantos = 1;
				Integer ascii = (int)c;
				if (frequencia.containsKey(ascii)) { 
					quantos += frequencia.get(ascii);
				}
				frequencia.put(ascii,quantos);				
			}
			Set<Integer> valores = new LinkedHashSet<>(frequencia.values());
			List<Integer> valoresList = new ArrayList<>(valores);
			Collections.sort(valoresList);
			for (Integer valor: valoresList) {
				List<Integer> chaves = getChaves(valor,frequencia);
				for (int i = chaves.size()-1;i>=0;i--) {
					System.out.println(chaves.get(i)+" "+valor);
				}
			}
		}
		sc.close();
	}

	private static List<Integer> getChaves(Integer valor,Map<Integer,Integer> frequencia) {
		List<Integer> resposta = new ArrayList<>();
		for (Integer chave: frequencia.keySet()) {
			if (frequencia.get(chave) == valor) {
				resposta.add(chave);
			}
		}
		Collections.sort(resposta);
		return resposta;
	}
}
