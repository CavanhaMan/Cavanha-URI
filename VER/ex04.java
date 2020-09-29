package projeto01;

import java.util.Scanner;

/* String - Exercicio04 - (22/09) - Validar tamanho do CPF - utilizar funções */

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
Faça um programa que leia uma variável cpf, do tipo String.
Verifique se o tamanho do CPF esta correto, um CPF precisa ter 11 dígitos.
Caso ele esteja correto imprima 'valido', senão imprima 'invalido'.
obs.:
- A entrada terá apenas dígitos numéricos.	ok
- Crie uma função que retorna boolean(true, false) e receba a String.
  Retorne True, se for válido e False, se for inválido.

Entrada			Saída
11122233344		valido
3424			invalido
*/