/*-------------------*
| Rodrigo CavanhaMan |
| URI 1222           |
| Concurso de Contos |
*--------------------*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			int C = sc.nextInt();
			sc.nextLine();
			String conto = sc.nextLine();
			int totalLinhas = 0;
			Integer quantosCaracteres = 0;
			String[] palavras = conto.split(" ");
			for (String palavra: palavras) {
				quantosCaracteres+=palavra.length();
				//se for maior, a palavra excedeu o limite máximo da linha
				if (quantosCaracteres > C) {
					totalLinhas++;
					//joga a palavra na outra linha, somando do caractere de espaço em branco
					quantosCaracteres = palavra.length()+1;
				//quando a palavra, ou a palavra+espaço em branco encerram a linha	
				}
				else if (quantosCaracteres == C || quantosCaracteres+1 == C) {
					totalLinhas++;					
					quantosCaracteres = 0;
				}
				else//soma o espaço em branco
					quantosCaracteres++;
			}
			if (quantosCaracteres > 0)
				totalLinhas++;
			int quantos = totalLinhas / L;
			if (totalLinhas % L > 0)
				quantos++;
			System.out.println(quantos);
		}
		sc.close();
	}
}