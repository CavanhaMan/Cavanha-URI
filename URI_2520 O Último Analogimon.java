/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2520            |
| O Último Analógimôn |
*---------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n,m,eui=0,euj=0,anai=0,anaj=0;
		while(sc.hasNext()){
			n = sc.nextInt();
			m = sc.nextInt();
			int[][] ans = new int[101][101];
			for(int i=0 ; i<n ; i++)
				for(int j=0 ; j<m ; j++){
					ans[i][j] = sc.nextInt();
					if(ans[i][j] == 1) {
						eui = i;
						euj = j;
					}
					if(ans[i][j] == 2) {
						anai = i;
						anaj = j;
					}
				}
			int res = 0;
			res = Math.abs(anaj-euj) + Math.abs(anai-eui);
			System.out.printf("%d\n",res);
		}
		sc.close();
		
	}
}