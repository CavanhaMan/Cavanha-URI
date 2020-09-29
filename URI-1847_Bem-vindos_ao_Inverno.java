/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 1847               |
| Bem-vindos ao Inverno! |
*------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ab = a-b;
		int bc = b-c;
		int ba = b-a;
		int cb = c-b;

		//subiu / desceu ou permaneceu :(
		if(a<b && b>=c)	System.out.println(":(");
		//subiu / subiu menos :(
		else if(a<b && b<c && ba>cb)	System.out.println(":(");
		//subiu / subiu igual ou > :)
		else if(a<b && b<c && ba<=cb) System.out.println(":)");//b<=c??
		//desceu / subiu ou permaneceu :)
		else if(a>b && b<=c)	System.out.println(":)");
		//desceu / desceu menos :)
		else if(a>b && b>c && ab>bc)	System.out.println(":)");
		//desceu / desceu igual ou < :(
		else if(a>b && b>c && ab<=bc)	System.out.println(":(");//b>=c??
		//permaneceu / subiu :)
		else if(a==b && b<c)	System.out.println(":)");
		//permaneceu / desceu :(
		else if(a==b && b>c)	System.out.println(":(");
		//permaneceu / permaneceu :(
		else System.out.println(":(");
		
		sc.close();
	}
}
