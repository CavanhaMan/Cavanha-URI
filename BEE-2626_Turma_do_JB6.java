/*-------------------*
| Rodrigo CavanhaMan |
| URI 2626           |
| Turma do JB6       |
*--------------------*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String venceDodo   = "Os atributos dos monstros vao ser inteligencia, sabedoria...";
		String venceLeo    = "Iron Maiden's gonna get you, no matter how far!";
		String vencePepper = "Urano perdeu algo muito precioso...";
		String venceEmpate = "Putz vei, o Leo ta demorando muito pra jogar...";
		while(sc.hasNext()) {
			String dodo = sc.next();
			String leo = sc.next();
			String pepper = sc.next();
					 if(dodo.equals("papel") && leo.equals("papel") && pepper.equals("tesoura")) System.out.println(vencePepper);
				else if(dodo.equals("papel") && leo.equals("pedra") && pepper.equals("pedra")) System.out.println(venceDodo);
				else if(dodo.equals("papel") && leo.equals("tesoura") && pepper.equals("papel")) System.out.println(venceLeo);
				else if(dodo.equals("pedra") && leo.equals("papel") && pepper.equals("pedra")) System.out.println(venceLeo);
				else if(dodo.equals("pedra") && leo.equals("pedra") && pepper.equals("papel")) System.out.println(vencePepper);
				else if(dodo.equals("pedra") && leo.equals("tesoura") && pepper.equals("tesoura")) System.out.println(venceDodo);
				else if(dodo.equals("tesoura") && leo.equals("papel") && pepper.equals("papel")) System.out.println(venceDodo);
				else if(dodo.equals("tesoura") && leo.equals("pedra") && pepper.equals("tesoura")) System.out.println(venceLeo);
				else if(dodo.equals("tesoura") && leo.equals("tesoura") && pepper.equals("pedra")) System.out.println(vencePepper);
				else System.out.println(venceEmpate);
		}
		sc.close();
	}
}
/*
papel	pedra	pedra	=	papel	dodo
pedra	papel	pedra	=	papel	leo
pedra	pedra	papel	=	papel	pepper
pedra	tesoura	tesoura	=	pedra	dodo
tesoura	pedra	tesoura	=	pedra	leo
tesoura	tesoura	pedra	=	pedra	pepper
papel	papel	tesoura	=	tesoura	pepper
papel	tesoura	papel	=	tesoura	leo
tesoura	papel	papel	=	tesoura	dodo
*/