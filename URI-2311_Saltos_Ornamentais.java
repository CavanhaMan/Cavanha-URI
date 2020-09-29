/*-------------------*
| Rodrigo CavanhaMan |
| URI 2311           |
| Saltor Ornamentais |
*--------------------*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int n = Integer.parseInt(sc.next());
		String nome = "";
		double graudif=0.0;
		List<Double> nota = new ArrayList<>();
		Double somanota=0.0;
		for (int i=0 ; i<n ; i++){
			nome = sc.next();
			graudif = sc.nextDouble();
			nota.add(sc.nextDouble());//0
			nota.add(sc.nextDouble());//1
			nota.add(sc.nextDouble());//2
			nota.add(sc.nextDouble());//3
			nota.add(sc.nextDouble());//4
			nota.add(sc.nextDouble());//5
			nota.add(sc.nextDouble());//6
			Collections.sort(nota);	// ordena a lista
			nota.remove(0); // remove a primeira e última nota
			nota.remove(5); // a última agora é o 5 pq já excluí a primeira!
			for (Double valor:nota)
				somanota+=valor;
			System.out.printf("%s %.2f\n",nome,somanota*graudif);
			somanota=0.0;
			nota = new ArrayList<>();
		}
		sc.close();
	}
}