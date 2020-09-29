package projeto01;

import java.util.Scanner;

/* String - Exercicio06 - (22/09) - Ler letra a letra na frase */

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = sc.nextLine();
		String[] newFrase = frase.split("");
		for (int i=0 ; i<newFrase.length ; i++)
			System.out.println(i + " - " + newFrase[i]);
		
		sc.close();
	}

}
/*
Faça um programa que receba como entrada uma frase e então 
imprima cada letra e sua posição, veja o exemplo abaixo.
Entrada	Saída
IFTM	0 - I
		1 - F
		2 - T
		3 - M
*/