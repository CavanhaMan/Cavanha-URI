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
		
		
			int C = 3;
			System.out.println("cifra1:");
			String encripta = sc.nextLine();
			char[] eAux = encripta.toLowerCase().toCharArray();
			System.out.println(eAux);//****************** CIFRA 1
			
			System.out.println("cifra2:");
			String decripta = sc.nextLine();
			char[] dAux = decripta.toLowerCase().toCharArray();
			System.out.println(dAux);//****************** CIFRA 2
			
			System.out.println("frase:");
			String entrada = sc.nextLine();
			char[] entradaAux = entrada.toCharArray();
			System.out.println(entradaAux);//************ FRASE
			
			int tamFrase = entradaAux.length;
			char[] saida = new char[tamFrase];
			saida = entradaAux;
			System.out.println(saida);
			
			for (int i=0 ; i<tamFrase ; i++) {
				for (int y=0 ; y<C ; y++) {
					if(entradaAux[i]==dAux[y]) {
						saida[i]=eAux[y];
					}
				}
			}
			System.out.println(String.copyValueOf(saida));
		
		sc.close();
	}
}
/*
variavelString.toLowerCase();
variavelString.toUpperCase();

				else if(Character.isUpperCase(entradaAux[i]))
					if(entradaAux[i]==Character.toUpperCase(dAux[y]))
						entradaAux[i]=Character.toUpperCase(eAux[y]);
				else if(Character.isLowerCase(entradaAux[i]))
					if(entradaAux[i]==Character.toLowerCase(dAux[y]))
						entradaAux[i]=Character.toLowerCase(eAux[y]);



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
