package projeto01;

import java.util.Scanner;

/* String - Exercicio04 - (22/09) - Validar tamanho do CPF - utilizar fun��es */

public class ex04 {
	public static void main(String[] args) {

		if (entraCpf()) System.out.println("valido");
		else System.out.println("invalido");
		
	}

	private static boolean entraCpf() {
		Scanner sc = new Scanner(System.in);
		String cpf = sc.nextLine();
		if (cpf.matches("[0-9]+") && cpf.length() == 11) return true;
		else return false;
	}
}
/*
Fa�a um programa que leia uma vari�vel cpf, do tipo String.
Verifique se o tamanho do CPF esta correto, um CPF precisa ter 11 d�gitos.
Caso ele esteja correto imprima 'valido', sen�o imprima 'invalido'.
obs.:
- A entrada ter� apenas d�gitos num�ricos.	ok
- Crie uma fun��o que retorna boolean(true, false) e receba a String.
  Retorne True, se for v�lido e False, se for inv�lido.

Entrada			Sa�da
11122233344		valido
3424			invalido
*/