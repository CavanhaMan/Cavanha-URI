/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1168      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        
        int x, Leds[], num;
        String n[];
        char aux;
        x = sc.nextInt();
        n = new String[x];
        Leds = new int[x];
        
        for(int i = 0; i < x; i++)
        	n[i] = sc.next();
        
        for(int i = 0; i <x; i++){
            num = n[i].length();
            for(int j = 0; j < num; j++){
            	aux = n[i].charAt(j);
                if(aux=='1')
                	Leds[i]+=2;
                else if(aux=='2' || aux=='3' || aux=='5')
                    Leds[i]+=5;
                else if(aux=='4')
                    Leds[i]+=4;
                else if(aux=='6' || aux=='9' || aux=='0')
                    Leds[i]+=6;
                else if(aux=='7')
                    Leds[i]+=3;
                else if(aux=='8')
                    Leds[i]+=7;
            }
            System.out.println(Leds[i]+" leds");
        }
        sc.close();
    }
}