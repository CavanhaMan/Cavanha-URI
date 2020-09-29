package projeto01;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(s1.substring(s1.indexOf(s2)));

		sc.close();
	}

}
/*
Faça um programa que receba como entrada duas Strings s1 e s2.
O algoritmo deve imprimir a parte/substring da String s1 que começa com 
a primeira ocorrência de s2 ou toda a frase s1, caso s2 não exista em s1.
obs.:
1. Não considerar acentos.
2. A função substring tem duas implementações: substring(int, int) e substring(int).

Entrada
Uberlandia tem dois campus do IFTM, o Uberlandia Centro e o Uberlandia.
IFTM

Saída
IFTM, o Uberlandia Centro e o Uberlandia.
*/