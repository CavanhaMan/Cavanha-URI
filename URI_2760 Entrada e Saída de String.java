/*--------------------------*
| Rodrigo CavanhaMan        |
| URI 2760                  |
| Entrada e Saída de String |
*---------------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		String[] a = new String[40];
		String input = sc.nextLine();
		a = input.split("");
		int ta=a.length;
		
		String[] b = new String[40];
		input = sc.nextLine();
		b = input.split("");
		int tb=b.length;
		
		String[] c = new String[40];
		input = sc.nextLine();
		c = input.split("");
		int tc=c.length;
		
		for(int i=0 ; i<ta ; i++) System.out.printf("%s",a[i]);
		for(int i=0 ; i<tb; i++) System.out.printf("%s",b[i]);
		for(int i=0 ; i<tc; i++) System.out.printf("%s",c[i]);
		System.out.println();
		
		for(int i=0 ; i<tb ; i++) System.out.printf("%s",b[i]);
		for(int i=0 ; i<tc; i++) System.out.printf("%s",c[i]);
		for(int i=0 ; i<ta; i++) System.out.printf("%s",a[i]);
		System.out.println();
		
		for(int i=0 ; i<tc; i++) System.out.printf("%s",c[i]);
		for(int i=0 ; i<ta; i++) System.out.printf("%s",a[i]);
		for(int i=0 ; i<tb; i++) System.out.printf("%s",b[i]);
		System.out.println();
		
		if(ta>10)ta=10;
		if(tb>10)tb=10;
		if(tc>10)tc=10;
		for(int i=0 ; i<ta; i++) System.out.printf("%s",a[i]);
		for(int i=0 ; i<tb; i++) System.out.printf("%s",b[i]);
		for(int i=0 ; i<tc; i++) System.out.printf("%s",c[i]);
		System.out.println();
		
		sc.close();
	}
}