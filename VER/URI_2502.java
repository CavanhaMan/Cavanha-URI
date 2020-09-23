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
				String encripta = sc.nextLine();
				char[] eAux = encripta.toCharArray();
				System.out.println(eAux);//****************** CIFRA 1
				System.out.println("cifra2:");
				String decripta = sc.nextLine();
				char[] dAux = decripta.toCharArray();
				System.out.println(dAux);//****************** CIFRA 2
				System.out.println("frase:");
				String entrada = sc.nextLine();
				char[] entradaAux = entrada.toCharArray();
				System.out.println(entradaAux);//************ FRASE
				char[] saida = new char[entradaAux.length];

				int tamFrase = entrada.length();
				
				for (int i=0 ; i<tamFrase ; i++) {
					if(entradaAux[i]=='a')
						entradaAux[i]='X';
				}
				/*
				
				for (int i=0 ; i<entrada.length() ; i++) 
					for (int y=0 ; y<eAux.length ; y++) { 
						saida[i]=entradaAux[i];
						if(entradaAux[i]==eAux[y])
							saida[i]=dAux[y];
					}*/
				System.out.println(String.copyValueOf(saida));
			}
		//}
		
		sc.close();
	}
}
/*
variavelString.toLowerCase();
variavelString.toUpperCase();

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
