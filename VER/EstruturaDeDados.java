import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
//package exemplos;

public class EstruturaDeDados {

	public static void main(String[] args) {
		//trabalhandoComSet();
		//trabalhandoComList();
		trabalhandoComMap();
		//testeOrdenacaoLista();
		//testeOrdenacaoListaString();
	}

	private static void testeOrdenacaoListaString() {
		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("q");
		lista.add("z");
		lista.add("d");
		lista.add("a");
		lista.add("g");
		lista.add("r");
		lista.add("a");

		System.out.println(lista.size());
		System.out.println(lista);
		System.out.println("__________________________");
		
		Collections.sort(lista);	// ordena a lista
		System.out.println(lista.size());
		System.out.println(lista);
		System.out.println("__________________________");
		
		lista.removeAll(lista); //remove todos os elementos da lista
		lista.clear(); 			//remove todos os elementos da lista
	}

	private static void testeOrdenacaoLista() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(300);
		lista.add(1);
		lista.add(300);
		lista.add(1);
		lista.add(1000);
		lista.add(200);
		lista.add(50);
		lista.add(200); //aceita repeticao!

		System.out.println(lista.size());
		System.out.println(lista);
		System.out.println("__________________________");
		
		Collections.sort(lista);	// ordena a lista
		System.out.println(lista.size());
		System.out.println(lista);
		System.out.println("__________________________");
	}

	private static void trabalhandoComMap() {
		
		Map<String,Integer> faltas = new HashMap<>();
		
		faltas.put("Eloah",3);
		faltas.put("Roberto",6);
		faltas.put("Rodrigo",0);
		faltas.put("Gabriel",6);
		faltas.put("Gabriel",50);
		faltas.put("Nayton",2);
		
		System.out.println(faltas);
		
		Set<String> chaves = faltas.keySet();
		for(String chave: chaves)
			System.out.println(chave);		//imprime todas as chaves

	
		Integer totalFaltas = 0;
		for (String chave: chaves)
			totalFaltas += faltas.get(chave);
		
		System.out.println(faltas.get("Rodrigo"));
		
		String AlunoAPesquisar = "Cavanha";
		if (faltas.containsKey(AlunoAPesquisar))
			System.out.println(faltas.get(AlunoAPesquisar));
		else
			faltas.put(AlunoAPesquisar, 9);
		
		AlunoAPesquisar = "Gabriel";
		if (faltas.containsKey(AlunoAPesquisar))
			System.out.println(faltas.get(AlunoAPesquisar));
		else
			faltas.put(AlunoAPesquisar, 9);
	
		System.out.println(faltas);
		faltas.put("Eloah", 20);
		
		System.out.println(faltas);
	
	}

	
	private static void trabalhandoComList() {

		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(1);
		lista.add(1000);
		lista.add(200);
		lista.add(200); //aceita repeticao!
		lista.add(200);
		lista.add(200);
		lista.add(50);

		System.out.println(lista.size());
		System.out.println(lista.get(2)); //imprime o valor na posicao 2
		System.out.println("__________________________");
		System.out.println(lista);
		
		Collections.sort(lista);	// ordena a lista
		System.out.println(lista.get(2)); //o valor na posicao 2 foi alterado devido à ordenacao
		System.out.println(lista);
		
		Collections.reverse(lista); //inverte a lista
		System.out.println(lista);

		System.out.println("__________________________");

		lista.remove(2);	//remove o item na posicao 2
		lista.remove(new Integer (200));  //remove o item "200" da lista
		
		Integer itemaremover = 50;
		lista.remove(itemaremover);	//remove o item "50" da lista

		System.out.println("__________________________");
		System.out.println(lista);
		System.out.println("__________________________\n");
		
		Set<Integer> conjunto = new LinkedHashSet<Integer>();
		conjunto.add(2);
		conjunto.add(3);		//criei um conjunto e add 2 valores
		lista.addAll(conjunto);  //adicionei o conjunto todo dentro da lista

		System.out.println("__________________________");
		System.out.println(lista);
		System.out.println("__________________________\n");

		List<Integer> listaConvertida = new ArrayList<>(conjunto);
		//crio uma lista nova com todo o conetudo do conjunto
		
		
		//duas formas de imprimir uma lista:
		System.out.println("__________________________");
		for (Integer valor: lista)
			System.out.println(valor);
		System.out.println("__________________________");
		for (int i=0 ; i<lista.size() ; i++)
			System.out.println(lista.get(i));
		System.out.println("__________________________\n");
		
		
	}

	private static void trabalhandoComSet() {
		Set<Integer> conjunto = new LinkedHashSet<Integer>();
		if (conjunto.add(1))
			System.out.println("Adicionou!");
		else
			System.out.println("Ja existe este numero la!");

		conjunto.add(100);
		conjunto.add(1);
		conjunto.add(200);
		conjunto.add(200);// nao aceita repeticao!!
		conjunto.add(200);
		conjunto.add(200);
		conjunto.add(200);
		conjunto.add(200);
		conjunto.add(1000);
		boolean adicionei1000Duplicado = conjunto.add(1000);
		System.out.println(adicionei1000Duplicado);
		System.out.println(conjunto.size());
		
		System.out.println(conjunto);
		
		if (conjunto.contains(1))
			System.out.println("tem 1");
		if (!conjunto.contains(777))
			System.out.println("nao tem 777");
		
		//se existe o valor "1" pra remover no grupo e conseguir remover (o retorno e booleano)
		if (conjunto.remove(1))
			System.out.println("removi o 1");	//entao imprime o resultado
		
		System.out.println(conjunto);
		
		System.out.println("__________________________");
		for(Integer valor: conjunto)		//imprimo o valor um a um 
			System.out.println(valor);		//utilizando o "forit"
		System.out.println("__________________________\n");
		
		Set<Integer> novoSet = new LinkedHashSet<Integer>();  //crio um novo conjunto
		
		novoSet.add(7777);			//insiro um novo valor neste novo conjunto
		novoSet.addAll(conjunto);	//insiro o conjunto inteiro dentro do conjunto "novoSet"
		
		System.out.println(novoSet);
	}
}
