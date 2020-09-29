/*-------------------*
| Rodrigo CavanhaMan |
| URI 2313           |
| Qual Triangulo     |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//"Valido-Equilatero"
		//todos os seus lados são congruentes, ou seja, tem sempre a mesma medida (são iguais).
//"Valido-Escaleno"
		//nenhum de seus lados é congruente a nenhum outro, ou seja, todos os seus três lados são diferentes.
//"Valido-Isoceles"
		//apresenta sempre dois lados congruentes, ou seja, dois lados são sempre iguais e um é diferente.

//"Retangulo: S"
		//um de seus ângulos internos for reto, ou seja, exatamente igual a 90°.
//"Retangulo: N"
		//h2 = ca2 + co2
				
		//Math.abs(x)
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int aux = a;
		
		//coloca o maior valor em A:
		if (aux<b) { aux = b; b=a; a=aux; }
		if (aux<c) { aux = c; c=a; a=aux; }
		
		//TESTA SE É TRIÂNGULO:
		//| b - c | < a < b + c
		int mat1 = Math.abs(b-c);
		//| a - c | < b < a + c 
		int mat2 = Math.abs(a-c);
		//| a - b | < c < a + b 		
		int mat3 = Math.abs(a-b);
		
		
		if (mat1<a && a<b+c && mat2<b && b<a+c && mat3<c && c<a+b) {
			if(a==b && b==c)
				System.out.println("Valido-Equilatero");
			else if((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=c))
				System.out.println("Valido-Isoceles");
			else if(a!=b && b!=c && a!=c)
				System.out.println("Valido-Escaleno");
			if(a*a == b*b +c*c)
				System.out.println("Retangulo: S");
			else
				System.out.println("Retangulo: N");
		}
		else
			System.out.println("Invalido");
			
		sc.close();
	}
}
