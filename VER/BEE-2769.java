/*
+-------------------+
|Rodrigo CavanhaMan |
|URI 2769           |
|Linha de Montagem  |
+-------------------+
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] e1 = new int[N];
		int[] e2 = new int[N];
		int[] a1 = new int[N];
		int[] a2 = new int[N];
		int[] t1 = new int[N];
		int[] t2 = new int[N];
		int x1 = 0;
		int x2 = 0;
		
		
		/*
		ok 3 	-> N número de etapas na linha de produção
		ok 1 1	  -> e1 e2 o tempo gasto para a entrada em cada uma das linhas de produção.
		1 2 3	-> a11 a12 a13 o tempo gasto para executar a iésima etapa na linha 1
		3 2 1	-> a21 a22 a23 os tempos de cada etapa na linha 2
		1 2			-> t11 t12 os tempos de transição da linha 1 para a linha 2,
		2 1			-> t21 t22 da linha 2 para a linha 1
		1 1			-> x1 x2 o tempo de saída de cada linha
		*/
		for (int i=0 ; i<N ; i++) 
			e1[i] = sc.nextInt();
		for (int i=0 ; i<N ; i++) 
			e2[i] = sc.nextInt();
		for (int i=0 ; i<N ; i++) 
			a1[i] = sc.nextInt();
		for (int i=0 ; i<N ; i++) 
			a2[i] = sc.nextInt();
		for (int i=0 ; i<N ; i++) 
			t1[i] = sc.nextInt();
		for (int i=0 ; i<N ; i++) 
			t2[i] = sc.nextInt();
		x1 = sc.nextInt();
		x2 = sc.nextInt();

		int i=0,j=0, result=0;
		result = resolve(i, j, N);
		
		


		//printf("%d\n", min(solve(0, 0), solve(1, 0)));
		
		sc.close();
	}

	
	private static int resolve(int i, int j, int N) {
		int[][] pd = new int[i][j];

	    if(pd[i][j]!=-1) return pd[i][j];
	    if(j==N) return pd[i][j]=a1[j]+x[i];
	    if(j==0) return pd[i][j]=e[i]+resolve(i,j+1);
	    return pd[i][j] = 
	        a[i][j]+min(resolve(i,j+1), t[i][j] + resolve(!i,j+1));
	}		



}
/*
3 	-> N número de etapas na linha de produção
1 1	  -> e1 e2 o tempo gasto para a entrada em cada uma das linhas de produção.
1 2 3	-> a11 a12 a13 o tempo gasto para executar a iésima etapa na linha 1
3 2 1	-> a21 a22 a23 os tempos de cada etapa na linha 2
1 2			-> t11 t12 os tempos de transição da linha 1 para a linha 2,
2 1			-> t21 t22 da linha 2 para a linha 1
1 1			-> x1 x2 o tempo de saída de cada linha
*/