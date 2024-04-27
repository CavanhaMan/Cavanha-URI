/*---------------------------*
| Rodrigo CavanhaMan         |
| BEE 1192                   |
| O jogo Matem�tico de Paula |
*----------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i=0 ; i<N ; i++) {
			char[] in = sc.nextLine().toCharArray();
			int n1 = Integer.parseInt(String.valueOf(in[0]));
			int n2 = Integer.parseInt(String.valueOf(in[2]));
			
			//Se os D�GITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois d�gitos
			if (n1 == n2)
				System.out.println(n1 * n2);
			
			//Se a letra for mai�scula, deve-se subtrair o primeiro d�gito do segundo.
			else if (Character.isUpperCase(in[1]))
				System.out.println(n2 - n1);
			
			//Se a letra for min�scula, deve-se somar ambos os d�gitos
			else if (Character.isLowerCase(in[1]))
				System.out.println(n1 + n2);
		}
		sc.close();
	}
}
