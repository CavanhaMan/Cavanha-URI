package projeto01;

import java.util.Scanner;

public class testaChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); // N�o esque�a de importar o Scanner no in�cio do c�digo!
		System.out.println("Digite um caractere qualquer e pressione Enter:");
		String str = entrada.next();
		char c = str.charAt(0); // Obter o caractere digitado

		// Usando a classe Character para obter informa��es:
		System.out.printf("� definido? %b%n", Character.isDefined(c));
		System.out.printf("� um d�gito? %b%n", Character.isDigit(c));
		System.out.printf("� uma letra? %b%n", Character.isLetter(c));
		System.out.printf("� letra ou d�gito? %b%n", Character.isLetterOrDigit(c));
		System.out.printf("Mai�sculo? %b%n", Character.isUpperCase(c));
		System.out.printf("Min�sculo? %b%n", Character.isLowerCase(c));
		System.out.printf("Converter para mai�sculo: %s%n", Character.toUpperCase(c));
		System.out.printf("Converter para min�sculo: %s%n", Character.toLowerCase(c));
		
	}

}
