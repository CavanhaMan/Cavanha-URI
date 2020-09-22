/*
+------------------+
|Rodrigo CavanhaMan|
|     URI 2222     |
+------------------+
Brincando com Conjuntos
*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		
		
		sc.close();
	}
}
/*
1 t = numero de instancias

4 n = quantidade de conjuntos 
1 ELEMENTOS	1
2 ELEMENTOS	1 5
3 ELEMENTOS	2 4 6
4 ELEMENTOS	1 3 5 7

5 n = quantidade de conjuntos
1 ELEMENTOS	1 2
1 ELEMENTOS	1 4
2 ELEMENTOS	1 4
2 ELEMENTOS	3 4
1 ELEMENTOS	2 QUANTAS OPERAÇÕES: 4

SAÍDA:
1 X Y: Retorna a quantidade de elementos distintos
       da intersecção entre o conjunto X com o Y.
2 X Y: Retorna a quantidade de elementos distintos
       da união entre o conjunto X com o Y.

*/