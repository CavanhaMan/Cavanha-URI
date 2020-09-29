/*-------------------*
| Rodrigo CavanhaMan |
| URI 1564           |
| Vai Ter Copa       |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    Scanner n=new Scanner(System.in);
	    String input;
	    int counter=0;

	    while(n.hasNextLine())
	    {
	        input=n.nextLine();
	        char[] charInput=input.toCharArray();
	        if (input.equals("0"))
	        	System.out.println("vai ter copa!");
	        else
	        	System.out.println("vai ter duas!");	    }
	    sc.close();
	}
}