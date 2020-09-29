/*-------------------*
| Rodrigo CavanhaMan |
| URI 1436           |
| Jogo do Tijolo     |
*--------------------*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i=0 ; i<t ; i++) {
			int n = sc.nextInt();
			List<Integer> lista = new ArrayList<>();
			for (int y=0 ; y<n ; y++)
				lista.add(sc.nextInt());
			Collections.sort(lista);
			int middle = lista.size()/2;
			int middleValue = lista.get(middle);
			System.out.printf("Case %d: %d\n",i+1,middleValue);
		}
		sc.close();
	}
}
