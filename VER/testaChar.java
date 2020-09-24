package projeto01;

import java.util.Scanner;

public class testaChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); // Não esqueça de importar o Scanner no início do código!
		System.out.println("Digite um caractere qualquer e pressione Enter:");
		String str = entrada.next();
		char c = str.charAt(0); // Obter o caractere digitado

		// Usando a classe Character para obter informações:
		System.out.printf("é definido? %b%n", Character.isDefined(c));
		System.out.printf("é um dígito? %b%n", Character.isDigit(c));
		System.out.printf("é uma letra? %b%n", Character.isLetter(c));
		System.out.printf("é letra ou dígito? %b%n", Character.isLetterOrDigit(c));
		System.out.printf("Maiúsculo? %b%n", Character.isUpperCase(c));
		System.out.printf("Minúsculo? %b%n", Character.isLowerCase(c));
		System.out.printf("Converter para maiúsculo: %s%n", Character.toUpperCase(c));
		System.out.printf("Converter para minúsculo: %s%n", Character.toLowerCase(c));
		
	}

}
