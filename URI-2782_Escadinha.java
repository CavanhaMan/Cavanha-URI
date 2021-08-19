/*
+------------------+
|Rodrigo CavanhaMan|
|URI 2782          |
|Escadinha         |
+------------------+
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		String entrada1 = sc.nextLine();
		String[] entr1 = entrada1.split(" ");
		List<Integer> num = new ArrayList<Integer>();
		for (int i=0 ; i<N ; i++) 
			num.add(Integer.parseInt(entr1[i]));
		
		int escadinha = 0;
		List<Integer> escada = new ArrayList<Integer>();
		List<Integer> numAux = new ArrayList<Integer>();
		numAux = num;

		//for (Integer x: num)
		//	System.out.println(x);
		//for (int i=0 ; i<num.size() ; i++)
		//	System.out.println(num.get(i));

		//---procura repetidos--------------------------
		for (int i=0 ; i<numAux.size() ; i++){
			for (int j=0 ; j<numAux.size() ; j++){
				if (numAux.get(i).equals(numAux.get(j))){
					escada.add(numAux.get(i));
				}
			}
			if(escada.size()>1){
				escadinha++;
				numAux.removeAll(Arrays.asList(numAux.get(i)));//remove TODOS item "50" da lista
				System.out.println("escada: "+escada);
				System.out.println("escadinha: "+escadinha);
			}
			escada.clear();
		}
		
		//---procura sequencia com intervalos---------------
		
		
		
		//int intervalo = Math.abs(num[0]-num[1]);
		//System.out.println(intervalo);
		
		sc.close();
	}
}
/*
IDENTIFICAR:
- NUMEROS REPETIDOS
- SEQUENCIAS COM INTERVALOS IGUAIS
- PAR DE NÚMEROS QUE SOBRAREM

URI-2782_Escadinha

12
458 458 1 3 1 -128 -128 8 12 457 457 1

1
112

7
11 11 -106 -223 -340 -457 -457


*/