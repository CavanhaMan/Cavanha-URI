/*
+-----------------------+
|Rodrigo CavanhaMan     |
|URI 2780               |
|Brincando com Conjuntos|
+-----------------------+
*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		if (D<=800)
			System.out.println("1");
		else if(800<D && D<=1400)
			System.out.println("2");
		else if(1400<D && D<=2000)
			System.out.println("3");
		sc.close();
	}
}
/*
Dada a distância D do robô até o início da quadra, onde está a cesta, a regra é a seguinte:
• Se D<=800, a cesta vale 1 ponto;
• Se 800<D<=1400, a cesta vale 2 pontos;
• Se 1400<D<=2000, a cesta vale 3 pontos.
*/