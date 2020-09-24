package projeto01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class testaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10); // 1
		numeros.add(30); // 1
		numeros.add(500); // 1
		numeros.add(40); // 1
		numeros.add(500); // 2
		numeros.add(10); // 2
		numeros.add(30); // 2
		numeros.add(500); // 3
		numeros.add(500); // 3
		numeros.add(500); // 3
		numeros.add(500); // 3
		numeros.add(500); // 3
		numeros.add(500); // 3
		numeros.add(40); // 2
		numeros.add(500); // 4
		numeros.add(30); // 3
		numeros.add(30); // 4
		numeros.add(10); // 3
		numeros.add(30); // 5
		numeros.add(500); // 5
		numeros.add(40); // 3
		
		System.out.println(numeros);
		Collections.sort(numeros);	// ordena a lista
		System.out.println(numeros);
		Set<Integer> numerosSemRepeticoes = new HashSet<Integer>(numeros);

		Iterator<Integer> iteradorDeNumerosSemRepeticoes = numerosSemRepeticoes.iterator();
		while (iteradorDeNumerosSemRepeticoes.hasNext()) {
			System.out.println(Collections.frequency(numeros,iteradorDeNumerosSemRepeticoes.next()));
		} // while
		
		final Map<Integer, Integer> idQuantidade = new HashMap<>();
		numeros.forEach(id -> idQuantidade.compute(id, (chave, valor) -> (valor == null ? 1 : valor + 1)));
		
		System.out.println(idQuantidade);
		
	}

}
