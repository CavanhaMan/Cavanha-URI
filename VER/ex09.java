package projeto01;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String T = sc.nextLine();
		String[] newT = T.split(" ");
		
		for (int i=0 ; i<newT.length ; i++)
			if (newT[i].length()>3)
				System.out.println(newT[i].substring(0,3));
		
		//System.out.print(String.join("\n", newFrase));
		sc.close();
	}
}
/*
Faça um programa que recebe como entrada uma frase T.
O programa deverá imprimir as 3 primeiras letras de todas as 
palavras, que tenham mais de 3 caracteres, presentes na frase T.
obs.:
- Não considerar acentos.
- Considerar o “ponto e virgula” como parte das palavras.

Exemplo:

Entrada:
Nos nao vemos as coisas como elas sao, mas como nos somos.

Saída
vem
coi
com
ela
sao
com
som

*/