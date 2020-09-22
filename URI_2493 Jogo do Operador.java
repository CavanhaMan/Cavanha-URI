/*-------------------*
| Rodrigo CavanhaMan |
| URI 2493           |
| Jogo do Operador   |
*--------------------*/
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int bomba=0,n=0;
			List<String> lista = new ArrayList<String>();
			//entra quantidade de jogadas
			String inaux = sc.nextLine();
			while (inaux.equals("")) //teste para linha em branco
				inaux = sc.nextLine();
			n = Integer.parseInt(inaux.trim());
			String[] expressao = new String[n];
			String[] jogadores = new String[n];
			//entra expressão
			for (int i=0 ; i<n ; i++){
				inaux = sc.nextLine();
				while (inaux.equals("")) //teste para linha em branco
					inaux = sc.nextLine();
				expressao[i] = inaux;
			}
			//entra jogador
			for (int i=0 ; i<n ; i++){
				inaux = sc.nextLine();
				while (inaux.equals("")) //teste para linha em branco
					inaux = sc.nextLine();
				jogadores[i] = inaux;
			}
			for (int i=0 ; i<n ; i++){
				String[] auxJo = new String[3];
				
				//separa dados do jogador
				auxJo = jogadores[i].split(" ");
				String jnome = auxJo[0];
				int jnum = Integer.parseInt(auxJo[1].trim())-1;
				String jsimbolo = auxJo[2];
				
				//separa dados da operação que o jogador escolheu
				String[] auxEx1 = new String[2];
				auxEx1 = expressao[jnum].split(" ");
				String[] auxEx2 = new String[2];
				auxEx2 = auxEx1[1].split("=");
				long opPrimNum = Long.parseLong(auxEx1[0].trim());//primeiro numero da operação
				long opSegNum  = Long.parseLong(auxEx2[0].trim());//segundo numero da operação
				long opResult  = Long.parseLong(auxEx2[1].trim());//resultado da operação
				
				/************************************************/
				long respMais  = opPrimNum + opSegNum;
				long respMenos = opPrimNum - opSegNum;
				long respVezes = opPrimNum * opSegNum;
				
				/************************************************/
				if (jsimbolo.equals("+"))
					if (respMais!=opResult){
						lista.add(jnome);
						bomba++;
					}
				if (jsimbolo.equals("-"))
					if (respMenos!=opResult){
						lista.add(jnome);
						bomba++;
					}
				if (jsimbolo.equals("*"))
					if (respVezes!=opResult){
						lista.add(jnome);
						bomba++;
					}
				if (jsimbolo.equals("I"))
					if (respVezes==opResult || respMais==opResult || respMenos==opResult){
						lista.add(jnome);
						bomba++;
					}
			}
			String saida = "";
			if (bomba == 0)
				System.out.printf("You Shall All Pass!");
			else{
				Collections.sort(lista);	// ordena a lista
				if (bomba == n)
					System.out.printf("None Shall Pass!");
				else
					for (String valor: lista)
						saida+= valor + " ";
	
			}
			if (saida.length() > 0)
			    saida = saida.substring (0, saida.length() - 1);
			System.out.println(saida);
		}
		sc.close();
	}
}