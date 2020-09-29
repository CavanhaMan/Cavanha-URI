/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 2600               |
| Tustin e Seu Dado Novo |
*------------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++) {
			int resposta=0;
			int[] dado = new int[6];
			for(int x=0 ; x<6 ; x++)
				dado[x] = sc.nextInt();
			
			for(int x=0 ; x<5 ; x++)
				for(int y=x+1 ; y<6 ; y++)
					if(dado[x]==dado[y]) {
						//System.out.println("1");
						resposta++;
					}
			for(int x=0 ; x<6 ; x++)
				if (dado[x]<1) {
					//System.out.println("2");
					resposta++;
				}
			
			if (dado[0]+dado[5]!=7 || dado[1]+dado[3]!=7 || dado[2]+dado[4]!=7) {
				//System.out.println("3");
				resposta++;
			}
			
			if (resposta==0)
				System.out.println("SIM");
			else
				System.out.println("NAO");
		}
		sc.close();
	}
}