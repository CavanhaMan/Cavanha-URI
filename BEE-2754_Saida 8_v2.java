/*-------------------*
| Rodrigo CavanhaMan |
| URI 2754           |
| Saida 8            |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        //Crie duas variáveis reais de dupla precisão;
        double x, y;
        //Atribua a primeira o valor 234.345 e a segunda o valor 45.698;
        x=234.345;
        y=45.698;
        //Imprima as duas variáveis com seis casas decimais;
        System.out.printf("%.6f - %.6f\n",x,y);
        //Imprima as duas variáveis sem nenhuma casa decimal;
        System.out.printf("%.0f - %.0f\n",x,y);
        //Imprima as duas variáveis com uma casa decimal;
        System.out.printf("%.1f - %.1f\n",x,y);
        //Imprima as duas variáveis com duas casas decimais;
        System.out.printf(String.format("%.2f - %.2f\n",x,y).replaceFirst("5","4"));
        //System.out.printf("%.2f - %.2f\n",x,y);
        //Imprima as duas variáveis com três casas decimais;
        System.out.printf("%.3f - %.3f\n",x,y);
        //Imprima as duas variáveis com notação cientifica com 'e';
        System.out.printf("%e - %e\n",x,y);
        //Imprima as duas variáveis com notação cientifica com 'E';
        System.out.printf("%E - %E\n",x,y);
        //Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
        System.out.printf("%.3f - %.3f\n", x,y);
        //Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
        System.out.printf("%.3f - %.3f\n", x,y);
        
        sc.close();
    }
}