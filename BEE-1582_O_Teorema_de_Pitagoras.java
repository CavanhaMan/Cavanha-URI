/*-----------------------*
| Rodrigo CavanhaMan     |
| URI 1582               |
| O Teorema de Pitagoras |
*------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class URI_1582 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
   		
			pitag(a, b, c);
			test(a,b);
			if( pitag(a,b,c)==true && test(test(a,b),c)==1)
				System.out.println("tripla pitagorica primitiva");
			else if(pitag(a,b,c))
				System.out.println("tripla pitagorica");
			else
				System.out.println("tripla");
			
			//sc.close();
		}
	}

	private static int test(int a, int b) {
		int temp=0;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;
		}
		return a ;
	}

	private static boolean pitag(int a, int b, int c) {
		int maior=a,t1=b,t2=c;
		if(b>maior && b>c){
			maior=b;
			t1=a;t2=c;
        	return (maior*maior)==(t1*t1)+(t2*t2);
        }
        else if(c>maior && c>b){
        	maior=c;
	        t1=b;t2=a;
	        return (maior*maior)==(t1*t1)+(t2*t2);
        }
        else
        	return (maior*maior)==(t1*t1)+(t2*t2);
	}
}
