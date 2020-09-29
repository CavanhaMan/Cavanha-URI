/*----------------------*
| Rodrigo CavanhaMan    |
| URI 1244              |
| Ordenação por Tamanho |
*-----------------------*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//import java.util.Locale;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		//Locale.setDefault(new Locale("en", "US"));
		
		int n = Integer.parseInt(sc.nextLine());

		for(int q=0 ; q<n ; q++){
			String entrada = sc.nextLine();
			String[] entr = entrada.split(" ");
			List<String> lista = new ArrayList<>();

			for(int i=0 ; i<entr.length ; i++)
				lista.add(entr[i]);
			
			 while(!lista.isEmpty()) {
		            String maior = "";
		            for(String x : lista) 
		                if(x.length() > maior.length())
		                    maior = x;

		            System.out.printf("%s",maior);
		            if(lista.contains(maior))  //antes usava while
		                lista.remove(maior);
		            
					if(!lista.isEmpty()) 
						System.out.printf(" ");
		        }
				System.out.println("");
		}
		sc.close();
	}
}