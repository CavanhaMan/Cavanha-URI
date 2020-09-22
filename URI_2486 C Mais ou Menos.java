/*-------------------*
| Rodrigo CavanhaMan |
| URI 2486           |
| C Mais ou C Menos  |
*--------------------*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Map<String, Integer> c = new HashMap<String, Integer>();

    	c.put("suco de laranja",120);
    	c.put("morango fresco",85);
    	c.put("mamao",85);
    	c.put("goiaba vermelha",70);
    	c.put("manga",56);
    	c.put("laranja",50);
    	c.put("brocolis",34);
      	int t=1;
		while (t!=0){
      	  t = Integer.parseInt(sc.nextLine());
		  if(t!=0){
			int vitaminas = 0;
			for(int z=0 ; z<t ; z++){
				int quant = Integer.parseInt(sc.next());
				String entrada = sc.nextLine();
				entrada = new StringBuilder(entrada).reverse().toString();
				entrada = entrada.substring(0, entrada.length()-1);
				entrada = new StringBuilder(entrada).reverse().toString();
				if (c.containsKey(entrada))
					vitaminas+=c.get(entrada)*quant;
	    	}
			if(vitaminas>130)
				System.out.printf("Menos %d mg\n", vitaminas-130);
			else if(vitaminas<110)
				System.out.printf("Mais %d mg\n", 110-vitaminas);
			else
				System.out.printf("%d mg\n", vitaminas);
		  }
		}
	
	sc.close();
	}
}