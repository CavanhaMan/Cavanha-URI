/*-------------------*
| Rodrigo CavanhaMan |
| URI 2724           |
| Ajude Patatatitu   |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());	//número de casos de teste
		for (int i=0 ; i<n ; i++) {
			
			int t = Integer.parseInt(sc.nextLine());//número de compostos perigosos possíveis
			String[] formula = new String[t];
			for (int x=0 ; x<t ; x++)
				formula[x] = sc.nextLine();
			
			int u = Integer.parseInt(sc.nextLine());//quantidade experiencias que Juvenal irá realizar
			String[] teste = new String[u];
			for (int x=0 ; x<u ; x++)
				teste[x] = sc.nextLine();
			
			for (int y=0 ; y<u ; y++) {
				int ok=0;
				for (int x=0 ; x<t ; x++) {
					//System.out.println("existe formula no teste?" + teste[y].indexOf(formula[x]));
					if(teste[y].indexOf(formula[x]) != -1){
						String[] checaProx = teste[y].split(formula[x]);
						//System.out.println(checaProx.length);
						if (checaProx.length>1) {
							String[] checa = checaProx[1].split("");
							//se for letra maiuscula -->somma ok
							//				ou
							//se não for número ------->soma ok
							if(!isLowerCase(checa[0]) && !isNotNumber(checa[0]))
								ok++;
						}
						else
							ok++;
					}
				}
				if (ok!=0) System.out.println("Abortar");
				else System.out.println("Prossiga");
			}
			if(i<n-1) System.out.println();
		}
		sc.close();
	}

	private static boolean isNotNumber(String string) {
		char[] c = string.toCharArray();
		//System.out.println("é numero " + Character.isDigit(c[0]));
		return Character.isDigit(c[0]);
	}

	private static boolean isLowerCase(String string) {
		//System.out.println("é minusculo " + string.toLowerCase().equals(string));
	    return string.toLowerCase().equals(string);  
	}
}