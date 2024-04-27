/*---------------------------------*
| Rodrigo CavanhaMan               |
| URI 2502                         |
| Decifrando a Carta Criptografada |
*----------------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()) {
			//System.out.println("C e N:");
			String[] inicia = sc.nextLine().split(" ");
			int C = Integer.parseInt(inicia[0]);
			int N = Integer.parseInt(inicia[1]);
			
			//System.out.println("cifra1:");
			String encripta = sc.nextLine();
			char[] eAux = encripta.toLowerCase().toCharArray();
			
			//System.out.println("cifra2:");
			String decripta = sc.nextLine();
			char[] dAux = decripta.toLowerCase().toCharArray();
			
			for(int x=0 ; x<N ; x++) {
			
				//System.out.println("frase:");
				String entrada = sc.nextLine();
				char[] entradaAux = entrada.toCharArray();
				
				int tamFrase = entradaAux.length;
				char[] saida = new char[tamFrase];
				saida = entradaAux;
				
				for (int i=0 ; i<tamFrase ; i++) {
					for (int y=0 ; y<C ; y++) {
					    if(Character.isUpperCase(entradaAux[i])) {
							if(entradaAux[i]==Character.toUpperCase(eAux[y])) 
								saida[i]=Character.toUpperCase(dAux[y]);
							else if(entradaAux[i]==Character.toUpperCase(dAux[y])) 
								saida[i]=Character.toUpperCase(eAux[y]);
					    }
					    else { 
							if(entradaAux[i]==eAux[y]) 
								saida[i]=dAux[y];
							else if(entradaAux[i]==dAux[y]) 
								saida[i]=eAux[y];
					    }
					}
				}
				System.out.println(String.copyValueOf(saida));
			}
			System.out.println();
		}
		sc.close();
	}
}
