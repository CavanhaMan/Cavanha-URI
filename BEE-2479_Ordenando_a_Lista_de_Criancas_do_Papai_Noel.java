/*--------------------------------------------*
| Rodrigo CavanhaMan                          |
| URI 2479                                    |
| Ordenando a Lista de Crianças do Papai Noel |
*---------------------------------------------*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = Integer.parseInt(sc.nextLine());
		int ok=0,naook=0;
		List<String> lista = new ArrayList<>();
		for(int i=0 ; i<c ; i++) {
			String nome = sc.nextLine();
			int tam = nome.length();
			String bom = nome.substring(0,tam-(tam-1));
			nome = nome.substring(2, tam);
			lista.add(nome);
			if (bom.equals("+"))
				ok++;
			else if (bom.equals("-"))
				naook++;
		}
		Collections.sort(lista);
		for(String n: lista)
			System.out.println(n);
		System.out.printf("Se comportaram: %d | Nao se comportaram: %d\n",ok,naook);

		sc.close();
	}
}