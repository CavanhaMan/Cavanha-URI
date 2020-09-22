/*--------------------------------*
| Rodrigo CavanhaMan              |
| URI 2761                        |
| Entrada e Saída de Vários Tipos |
*---------------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//Crie uma variável inteira;
		int a = Integer.parseInt(sc.next());
		//Crie uma variável real de simples precisão;
		float b = Float.parseFloat(sc.next());
		//Crie uma variável que armazene um caracter;
		char c = sc.next().charAt(0);
		//Crie uma variável que armazene uma frase de no máximo 50 caracteres;
		String[] d = new String[50];
		String input = sc.nextLine();
		d = input.split("");
		String sd=""; 
		for(int i=1 ; i<d.length; i++) sd+=d[i];
		//Leia todas as variáveis na ordem da forma criada;
		
		//Imprima todas as variáveis como foram lidas;
		System.out.printf("%d%.6f%c%s\n",a,b,c,sd);
		//Imprima as variáveis, separando-as por uma tabulação (8 espaços), na ordem que foram lidas;
		System.out.printf("%d\t%.6f\t%c\t%s\n",a,b,c,sd);
		//Imprima as variáveis com exatos 10 espaços.
		System.out.printf("%10d%10.6f%10c%10s\n",a,b,c,sd);
		
		sc.close();
	}
}