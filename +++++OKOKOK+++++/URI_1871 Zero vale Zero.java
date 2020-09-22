/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1871      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int M, N, soma;
		String s;
        
        M = sc.nextInt();
        N = sc.nextInt();        
        
        while(M != 0 && N != 0){
        	
        	soma = M + N;
        	s = String.valueOf(soma);
        	
        	for(int i=0 ; i<s.length() ; i++){
        		if(s.charAt(i) != '0')
        			System.out.printf("%s",s.charAt(i));
        		soma = 0;
        	}
        	System.out.printf("\n");

            M = sc.nextInt();
            N = sc.nextInt();        	
        }
        sc.close();
    }
}