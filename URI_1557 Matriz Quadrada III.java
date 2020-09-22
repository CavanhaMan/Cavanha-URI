/*--------------------*
| Rodrigo CavanhaMan  |
| URI  1557           |
| Matriz Quadrada III |
*---------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//MATRIZ[L][C]
		int L, C, tempMax;
		int temp, nInicio=1;
		int N = sc.nextInt();
		tempMax = (int) Math.pow(4,(N-1));
		while (N != 0){
			if (N == 1)
				System.out.println(1);
			else if (N == 2)
				System.out.println("1 2\n2 4");
			else{
				nInicio = 1;
				temp = nInicio;
				for (L=0 ; L<N ; L++){
					for (C=0 ; C<N ; C++){
						if(C==0){
							if(tempMax<=99)				System.out.printf("%2d", temp);
							else if(tempMax<=999)		System.out.printf("%3d", temp);
							else if(tempMax<=9999)		System.out.printf("%4d", temp);
							else if(tempMax<=99999)		System.out.printf("%5d", temp);
							else if(tempMax<=999999)	System.out.printf("%6d", temp);
							else if(tempMax<=9999999)	System.out.printf("%7d", temp);
							else if(tempMax<=99999999)	System.out.printf("%8d", temp);
							else						System.out.printf("%9d", temp);
						}
						if (C>0){
							if(tempMax<=99)				System.out.printf("%3d", temp);
							else if(tempMax<=999)		System.out.printf("%4d", temp);
							else if(tempMax<=9999)		System.out.printf("%5d", temp);
							else if(tempMax<=99999)		System.out.printf("%6d", temp);
							else if(tempMax<=999999)	System.out.printf("%7d", temp);
							else if(tempMax<=9999999)	System.out.printf("%8d", temp);
							else if(tempMax<=99999999)	System.out.printf("%9d", temp);
							else						System.out.printf("%10d", temp);

						}
						temp *= 2;
					}
					nInicio *= 2;
					temp = nInicio;
					System.out.println();
				}
			}
			N = sc.nextInt();
			tempMax = (int) Math.pow(4,(N-1));
			System.out.println();
		}
		sc.close();
	}
}  /*printf("%*d\n", 10, 0);*/