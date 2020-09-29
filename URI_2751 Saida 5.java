/*-------------------*
| Rodrigo CavanhaMan |
| URI 2751           |
| Saida 5            |
*--------------------*/
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		int a=15;
		int b=a/2;
		double c=15.456;
		double d=c/7;
		
/*  4 */System.out.println("Valores de b:");
/*  5 */System.out.println("-------------");
/*  6 */System.out.printf("1) b = %d\n",b);
/*  7 */System.out.printf("2) b = %20d\n",b);
/*  8 */System.out.printf("3) b = %020d\n",b);
/*  9 */System.out.printf("4) b = %-20d\n",b);
/* 10 */System.out.printf("5) b = %d%%\n",b);
/* 11 */System.out.println();
/* 12 */System.out.println("Valores de d:");
/* 13 */System.out.println("-------------");
/* 14 */System.out.printf("1) d = %f\n",d);
/* 15 */System.out.printf("2) d = %.0f\n",d);
/* 16 */System.out.printf("3) d = %.1f\n",d);
/* 17 */System.out.printf("4) d = %.2f\n",d);
/* 18 */System.out.printf("5) d = %.3f\n",d);
/* 19 */System.out.printf("6) d = %20.3f\n",d);
/* 20 */System.out.printf("7) d = %020.3f\n",d);
/* 21 */System.out.printf("8) d = %-20.3f\n",d);
/* 22 */System.out.printf("9) d = %.2f%%\n",d);
	}
}
