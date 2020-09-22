/*----------------------*
| Rodrigo CavanhaMan    |
| URI 1619              |
| Diferença entre Datas |
*-----------------------*/
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
        int casos = sc.nextInt();
        Date d1, d2;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < casos; i++) {
            try {
                d2 = sdf.parse(sc.next());
                d1 = sdf.parse(sc.next());
                long diferencaDias = (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24);
                System.out.println(Math.abs(diferencaDias));
            } catch (Exception e) {}
        }
        sc.close();
    }
}
