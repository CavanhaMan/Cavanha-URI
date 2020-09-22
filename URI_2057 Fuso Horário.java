/*-------------------*
| Rodrigo CavanhaMan |
| URI 2057           |
| Fuso Horario       |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		if (horasaida == 0)
			horasaida = 24;
		
		int ajuste = horasaida + tempoviagem + fuso;
		
		if (ajuste >=24)
			ajuste -= 24;
		
		System.out.println(ajuste);
		
		sc.close();
	}
}	