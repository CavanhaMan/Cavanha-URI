/*
+-------------------+
|Rodrigo CavanhaMan |
|URI 2779           |
|Album da Copa      |
+-------------------+
*/
import java.util.Locale;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  //espaços numerados de 1 a N
		int M = sc.nextInt();  //total de figurinhas ja compradas
		Set<Integer> X = new LinkedHashSet<Integer>();//qual figurinha já foi comprada
		for (int i=0 ; i<M ; i++)
			X.add(sc.nextInt());//não aceita repeticao ;-)
		System.out.println(N-X.size());
		
		sc.close();
	}
}