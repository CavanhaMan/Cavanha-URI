/*--------------------*
| Rodrigo CavanhaMan  |
| BEE 2721            |
| Indecisão das Renas |
*---------------------*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		String entrada = sc.nextLine();
		String[] entra = entrada.split(" ");
		List<Integer> intList = new ArrayList<Integer>();
		for (String s : entra) 
			   intList.add(Integer.valueOf(s));
		int soma=0;
		for (int x : intList) soma+=x; 
		//System.out.println(soma);
		
		String[] nomes = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
		int resto = soma % 9;
		//System.out.println(resto);
		if (resto==0) System.out.println("Rudolph");
		else System.out.println(nomes[resto-1]);
		
		sc.close();
	}
}
