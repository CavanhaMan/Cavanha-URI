/*-------------------*
| Rodrigo CavanhaMan |
| URI 2174           |
| Colecao de Pomekon |
*--------------------*/
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class pomekon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<String> nomesPomekon = new LinkedHashSet<>();
		int contaPomekon = Integer.parseInt(sc.nextLine());
		
		for (int i=0 ; i<contaPomekon ; i++)
			nomesPomekon.add(sc.nextLine());
		
		System.out.printf("Falta(m) %d pomekon(s).\n",(151 - nomesPomekon.size()));
	}

}