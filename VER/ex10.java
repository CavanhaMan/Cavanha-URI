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
Fa�a um programa que receba como entrada duas Strings s1 e s2.
O algoritmo deve imprimir a parte/substring da String s1 que come�a com 
a primeira ocorr�ncia de s2 ou toda a frase s1, caso s2 n�o exista em s1.
obs.:
1. N�o considerar acentos.
2. A fun��o substring tem duas implementa��es: substring(int, int) e substring(int).

Entrada
Uberlandia tem dois campus do IFTM, o Uberlandia Centro e o Uberlandia.
IFTM

Sa�da
IFTM, o Uberlandia Centro e o Uberlandia.
*/