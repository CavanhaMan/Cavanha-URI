/*
+------------------+
|Rodrigo CavanhaMan|
|     URI 2222     |
+------------------+
Brincando com Conjuntos
*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int i=0,j=0,Mi=0, Q=0, oper=0,c1=0,c2=0,result=0,aux1=0,aux2=0;
		//A primeira linha da entrada cont�m um inteiro T  - NUMERO DE INSTANCIAS
		int T = sc.nextInt();
		//Cada inst�ncia inicia com um inteiro N - QUANTIDADE DE CONJUNTOS
		int N = sc.nextInt();
		int[][] conj = new int[N][60];
		
		for (i=0 ; i<N ; i++){
			Mi = sc.nextInt();
			for (j=0 ; j<Mi ; j++){
				System.out.printf("\nConjunto[%d][%d]: ",i,j);
				conj[i][j]=sc.nextInt();
			}
		}

		//Na pr�xima linha cont�m um inteiro Q - QUANTAS OPERA��ES
		Q = sc.nextInt();
		
		for (i=0 ; i<Q ; i++){
			oper=sc.nextInt();
			c1=sc.nextInt();
			c2=sc.nextInt();		
			System.out.println(conj[c1].length);
			System.out.println(conj[c2].length);
			aux1 = conj[c1].length;
			aux2 = conj[c2].length;
			
			if (oper==1) //elementos distintos da intersec��o
				for(int a:conj[c1])
					for(int b:conj[c2])
						if(a==b)
							result++;
			if (oper==2) //elementos distintos da uni�o
				for(int a:conj[c1])
					for(int b:conj[c2])
						if(a!=b)
							result++;
		}
			
		System.out.println(result);
		result=0;
		/*
		for (i=0 ; i<N ; i++){
			for (j=0 ; j<Mi ; j++)
				System.out.print(conj[i][j]);
			System.out.println();
		}
		*/
		sc.close();
	}
}
//A primeira linha da entrada cont�m um inteiro T indicando o n�mero de inst�ncias:
//T = 1
//Cada inst�ncia inicia com um inteiro N (1 <= N <= 10^4), representando a quantidade de conjuntos que Dabriel possui.
//N = 4
//As pr�ximas N linhas come�am com um inteiro Mi (1 <= Mi <= 60), que indica o total de elementos que o conjunto i possui
//segue ent�o Mi inteiros Xij (1 <= Xij <= 60), que representam o valor de cada elemento
//1 : 1
//2 : 1 5
//3 : 2 4 6
//4 : 1 3 5 7

//Na pr�xima linha cont�m um inteiro Q (1 <= Q <= 10^6), representando quantas opera��es Dabriel deseja realizar.
//Q = 5
//Nas pr�ximas Q linhas ter� a descri��o de uma opera��o.
//1 1 2
//1 1 4
//2 1 4
//2 3 4
//1 2 4

//1 X Y: Retorna a quantidade de elementos distintos da intersec��o entre o conjunto X com o Y.
//2 X Y: Retorna a quantidade de elementos distintos da uni�o entre o conjunto X com o Y.