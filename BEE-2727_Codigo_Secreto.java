/*-------------------*
| Rodrigo CavanhaMan |
| URI 2727           |
| Código Secreto     |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			String[] cod = new String[n];
			for (int x=0 ; x<n ; x++)
				cod[x] = sc.nextLine();
			for (int x=0 ; x<n ; x++) {
				if(cod[x].equals(".")) System.out.println("a");
				if(cod[x].equals("..")) System.out.println("b");
				if(cod[x].equals("...")) System.out.println("c");
				if(cod[x].equals(". .")) System.out.println("d");
				if(cod[x].equals(".. ..")) System.out.println("e");
				if(cod[x].equals("... ...")) System.out.println("f");
				if(cod[x].equals(". . .")) System.out.println("g");
				if(cod[x].equals(".. .. ..")) System.out.println("h");
				if(cod[x].equals("... ... ...")) System.out.println("i");
				if(cod[x].equals(". . . .")) System.out.println("j");
				if(cod[x].equals(".. .. .. ..")) System.out.println("k");
				if(cod[x].equals("... ... ... ...")) System.out.println("l");
				if(cod[x].equals(". . . . .")) System.out.println("m");
				if(cod[x].equals(".. .. .. .. ..")) System.out.println("n");
				if(cod[x].equals("... ... ... ... ...")) System.out.println("o");
				if(cod[x].equals(". . . . . .")) System.out.println("p");
				if(cod[x].equals(".. .. .. .. .. ..")) System.out.println("q");
				if(cod[x].equals("... ... ... ... ... ...")) System.out.println("r");
				if(cod[x].equals(". . . . . . .")) System.out.println("s");
				if(cod[x].equals(".. .. .. .. .. .. ..")) System.out.println("t");
				if(cod[x].equals("... ... ... ... ... ... ...")) System.out.println("u");
				if(cod[x].equals(". . . . . . . .")) System.out.println("v");
				if(cod[x].equals(".. .. .. .. .. .. .. ..")) System.out.println("w");
				if(cod[x].equals("... ... ... ... ... ... ... ...")) System.out.println("x");
				if(cod[x].equals(". . . . . . . . .")) System.out.println("y");
				if(cod[x].equals(".. .. .. .. .. .. .. .. ..")) System.out.println("z");

			}
		}
		sc.close();
	}

}
