/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1024      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		sc.nextLine();
		for (int i=0 ; i<N ; i++){
			String str = sc.nextLine();
			char[] s = str.toCharArray();
			s = converter(s);
			System.out.println(s);
		}
		sc.close();
	}
	
	public static boolean letra(char c){
		return c>='a' && c<='z' || c>='A' && c<='Z';
	}
	
	public static char[] converter(char[] s){
		//primeira passada
		for (int i=0 ; i<s.length ; i++)
			if (letra(s[i]))
				s[i]+=3;
		
		//segunda passada
		s = new StringBuilder(new String(s)).reverse().toString().toCharArray();
		
		//terceira passada
		for (int i=(s.length/2) ; i<s.length ; i++)
			s[i]-=1;
		
		return s;
	}
}