package projeto01;
/*
+------------------+
|Rodrigo CavanhaMan|
|     URI 2502     |
+------------------+
Decifrando a Carta Criptografada
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		
		//while (sc.hasNext()) {
			System.out.println("tamanho da cifra:");
			int C = sc.nextInt(); //tamanho da cifra
			System.out.println("quantidade de frases:");
			int N = sc.nextInt(); //quantidade de frases
			for (int x=0 ; x<N ; x++) {
				System.out.println("cifra1:");
				String encripta = sc.next();
				char[] eAux = encripta.toCharArray();
				System.out.println("cifra2:");
				String decripta = sc.next();
				char[] dAux = decripta.toCharArray();
				System.out.println("frase:");
				String entrada = sc.next();
				char[] entradaAux = entrada.toCharArray();
				char[] saida = new char[entradaAux.length];
				for (int i=0 ; i<entrada.length() ; i++) 
					for (int y=0 ; y<eAux.length ; y++) { 
						saida[i]=entradaAux[i];
						if(entradaAux[i]==eAux[y])
							saida[i]=dAux[y];
					}
				System.out.println(String.copyValueOf(saida));
			}
		//}
		
		sc.close();
	}
}
/*

3 1
UMA
123
Cada um por si

C3d3 12 por si

123 3 123
uma a uma

5 3
ZENIT
POLAR

Osro roxre osri caftide
Este texto esta cifrado

Osri o umi roclaci do ctazregtifai zet subsraruacie
Esta e uma tecnica de criptografia por substituicao

Zedo sot ficanmolro quobtide i zitrat do umi bei imesrti do roxre
Pode ser facilmente quebrado a partir de uma boa amostra de texto

*/
