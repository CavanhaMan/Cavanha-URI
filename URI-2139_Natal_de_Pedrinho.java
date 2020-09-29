/*-------------------*
| Rodrigo CavanhaMan |
| URI 2139           |
| Natal e Pedrinho   |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		while(sc.hasNext()){
			int mes = sc.nextInt();
			int dia = sc.nextInt();
			
			int jan=31,fev=29,mar=31,abr=30,mai=31,jun=30,jul=31,ago=31,set=30,out=31,nov=30;
			
			if (mes==12){
				if (dia<24) 		System.out.printf("Faltam %d dias para o natal!\n",25-dia);
				else if (dia==24)	System.out.println("E vespera de natal!");
				else if (dia==25)	System.out.println("E natal!");
				else				System.out.println("Ja passou!");
			}
			if (mes==11) System.out.printf("Faltam %d dias para o natal!\n",nov-dia+25);
			if (mes==10) System.out.printf("Faltam %d dias para o natal!\n",nov+out-dia+25);
			if (mes==9)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set-dia+25);
			if (mes==8)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago-dia+25);
			if (mes==7)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul-dia+25);
			if (mes==6)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul+jun-dia+25);
			if (mes==5)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul+jun+mai-dia+25);
			if (mes==4)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul+jun+mai+abr-dia+25);
			if (mes==3)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul+jun+mai+abr+mar-dia+25);
			if (mes==2)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul+jun+mai+abr+mar+fev-dia+25);
			if (mes==1)  System.out.printf("Faltam %d dias para o natal!\n",nov+out+set+ago+jul+jun+mai+abr+mar+fev+jan-dia+25);
		}
		sc.close();
	}
}