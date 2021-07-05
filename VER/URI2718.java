/*-------------------*
| Rodrigo CavanhaMan |
| URI 2718           |
| Luzes de Natal     |
*--------------------*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class URI2718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()){
			int n = sc.nextInt(); //quantidade de grupos
			for (int z=0 ; z<n ; z++) {
				int conta=0;
				int resto=0;
				int auxMais=0;
				int auxMenos=0;
				int x = sc.nextInt();
				//int div=1;
				ArrayList<Integer> binario = new ArrayList<Integer>();
				while(x>0) {
					resto=x%2;
					x/=2;
					if(resto==1)
						auxMais++;
					else if(resto==0) {
						auxMenos--;
					}
					System.out.println("r: "+resto);
					System.out.println("x: "+x);
					System.out.println("a+: "+auxMais);
					System.out.println("a-: "+auxMenos);
					binario.add(resto);
					conta=binario.size()+auxMenos;

				}
				System.out.println("RESULTADO: "+conta);
				Collections.reverse(binario);
				for (int w : binario) System.out.print(w);
				System.out.println();
			}
		}
		
		sc.close();
	}
}
/*
dividir o pisca pisca em grupos ordenados de 50 lâmpadas
e em cada grupo só consertar a maior quantidade de lâmpadas consecutivas queimadas.

3
11 = 1011 = 2
7 = 111 = 3
23 = 10111 = 3

3511 = 110110110111 = 9
7355 = 1110010111011 = 8

*/