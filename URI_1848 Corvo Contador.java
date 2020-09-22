/*-------------------*
| Rodrigo CavanhaMan |
| URI 1848           |
| Corvo Contador     |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//"caw caw"
		//---		--*		-*-		-**
		//000		001		010		011
		//*-		*-*		**-		***
		//100		101		110		111
		
		int contapio=0, num=0;
		int[] resultado = new int[3];
		while(contapio<3){
			String corvo = sc.nextLine();
			if (corvo.equals("caw caw")) {
				resultado[contapio]=num;
				contapio++;
				num=0;
			}
			else if(corvo.equals("--*")) num+=1;
			else if(corvo.equals("-*-")) num+=2;
			else if(corvo.equals("-**")) num+=3;
			else if(corvo.equals("*-")) num+=4;
			else if(corvo.equals("*-*")) num+=5;
			else if(corvo.equals("**-")) num+=6;
			else if(corvo.equals("***")) num+=7;
		}
		
		System.out.println(resultado[0]);
		System.out.println(resultado[1]);
		System.out.println(resultado[2]);
		
		sc.close();
	}
}
