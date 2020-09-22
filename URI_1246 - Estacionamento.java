/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1246      |
+--------------------+
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// comprimento do estacionamento
			int C = sc.nextInt();
			// total eventos percorridos
			int N = sc.nextInt();
			
			//um novo estacionamento com C espa�os � criado para cada itera��o
			Estacionamento estacionamento = new Estacionamento();
			estacionamento.espacos = new int[C];
			int valorTotal = 0;
			
			for (int i = 0; i < N; i++) {
				char entradaSaida = sc.next().charAt(0);
				if (entradaSaida == 'C') {
					int placa = sc.nextInt();
					int tamanho = sc.nextInt();
					if (estacionamento.adicionaCarro(placa,tamanho)) 
						valorTotal += 10;
				}
				else if (entradaSaida == 'S') {
					int placa = sc.nextInt();
					estacionamento.removeCarro(placa);
				}
			}
			System.out.println(valorTotal);
		}
		sc.close();
	}
}

class Estacionamento {
	int[] espacos;

	/**
	 * vai tentar adicionar o carro no estacionamento. Retornar� verdadeiro se conseguir,
	 * e falso se n�o conseguir
	 * @param placa
	 * @param tamanho
	 */
	public boolean adicionaCarro(int placa, int tamanho) {
		int posicaoInicial = getPosicao(tamanho);
		if (posicaoInicial == -1) 
			return false;

		for (int i = posicaoInicial; i < posicaoInicial + tamanho;i++)
			espacos[i] = placa;

		return true;
	}

	/**
	 * retorna a posi��o inicial onde o carro de tamanho X poder� estacionar
	 * se o carro n�o couber no estacionamento, o m�todo retorna -1, indicando
	 * que n�o existe essa posi��o inicial.
	 * @param tamanho
	 */
	private int getPosicao(int tamanho) {
		int posIni = -1;
		for (int i = 0; i < espacos.length; i++) {
			int espaco = espacos[i];
			if (espaco == 0) {
				if (posIni == -1)
					posIni = i;
				if (i+1 - posIni >= tamanho)
					return posIni;
			} 
			else
				posIni = -1;
		}
		if (espacos.length - posIni >= tamanho)
			return posIni;
		return -1;
	}
	
	/**
	 * Remove o carro da lista. Ex: lista com [0,1001,1001,1002,1002,0,0] 
	 * vai setar o valor 0 (espa�o vazio) para todas as posi��es com a placa informada
	 * @param placa
	 */
	public void removeCarro(int placa) {
		for (int i = 0; i < espacos.length;i++)
			if (espacos[i] == placa)
				espacos[i] = 0;
	}
}