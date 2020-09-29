package projeto01;

import java.util.Scanner;

/* String - Exercicio07 - (22/09) - Tratar data */

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String data = sc.nextLine();
		String d = data.substring(0,2);
		System.out.printf("Estamos no dia %s do mes.\n",d);
		sc.close();
	}

}
/*
Faça um programa que recebe como entrada a variável String 'data'.
Então pegue a substring com os dois primeiros caracteres e salve em
outra variável String 'd'. Então imprima "Estamos no dia 'd' do mes.".
obs.:
- Utilize a função substring.

Entrada	Saída
09/01/2020	Estamos no dia 09 do mes.
27/01/2019	Estamos no dia 27 do mes.
*/