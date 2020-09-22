/*-------------------*
| Rodrigo CavanhaMan |
| URI 2140           |
| Duas Notas         |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int compra = sc.nextInt();
		int pago = sc.nextInt();
		int troco;
		
		while (compra!=0 && pago!=001){
			troco = pago - compra;

			if (checaValor(troco))
				System.out.println("possible");
			else
				System.out.println("impossible");
			compra = sc.nextInt();
			pago = sc.nextInt();
		}
		sc.close();
	}
	public static boolean checaValor (int tr){
		int[] notas = {4,7,10,12,15,20,22,25,30,40,52,55,60,70,100,102,105,110,120,150,200};
		for (int i=0 ; i<notas.length ; i++)
			if (notas[i]==tr)
				return true;
		return false;
	}
	
}