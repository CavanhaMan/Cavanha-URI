/*--------------------*
| Rodrigo CavanhaMan  |
| URI 1120            |
| Revisão de Contrato |
*---------------------*/
import java.util.Scanner;
import java.math.BigDecimal;
public class uri_1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
    	int checa=1;
    	String d = sc.next();
    	String n = sc.next();
    	if (d.equals("0") && n.equals("0")) checa=0;
    	else checa=1;
		//while(!n.equals("0") && !d.equals("0")){
		while(checa==1){
	    	int troca=1;
	    	while(troca==1){
		    	if(n.contains(d))
					n = n.replace(d,"");
		    	else
		    		troca=0;
	    	}
	    	if(n.replace("0", "").equals(""))
		    	System.out.println("0");
	    	else if(n.equals(""))
	    		System.out.println("0");
	    	else{
	    		BigDecimal result = new BigDecimal(n);
	    		System.out.println(result);
	    	}
	    	d = sc.next();
	    	n = sc.next();
	    	if (d.equals("0") && n.equals("0")) checa=0;
	    	else checa=1;
	    }
		sc.close();
	}	
}
