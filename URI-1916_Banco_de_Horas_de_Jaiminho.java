/*---------------------------*
| Rodrigo CavanhaMan         |
| URI 1916                   |
| Banco de Horas de Jaiminho |
*----------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		//A1:B1 A2:B2 | C1:D1 C2:D2
		//HEM:MEM HSM:MSM | HET:MET HST:MST
		//08:00 12:00 | 14:00 18:00
		
		int QT = sc.nextInt();
		int HEM,MEM,HSM,MSM,HET,MET,HST,MST,TotManha,TotTarde,DuracaoH=0,DuracaoM=0,BancoHoras=0;
		
		while (QT > 0){
			
			int N = sc.nextInt();
			
			for (int i=0 ; i<N ; i++){
		
				String HoraEM = sc.next();	//hora entrada manhã
				String HoraSM = sc.next();	//hora saída manhã
				String pt = sc.next();		//pipe
				String HoraET = sc.next();	//hora entrada tarde
				String HoraST = sc.next();	//hora saída tarde
				
				String[] Converte = HoraEM.split(":");
				HEM = Integer.parseInt(Converte[0]);
				MEM = Integer.parseInt(Converte[1]);
				if (MEM>=55){
					MEM=0;
					HEM+=1;
				}
				else if (MEM<=5)
					MEM=0;
				
				Converte = HoraSM.split(":");
				HSM = Integer.parseInt(Converte[0]);
				MSM = Integer.parseInt(Converte[1]);
				if (MSM>=55){
					MSM=0;
					HSM+=1;
				}
				else if (MSM<=5)
					MSM=0;
		
				Converte = HoraET.split(":");
				HET = Integer.parseInt(Converte[0]);
				MET = Integer.parseInt(Converte[1]);
				if (MET>=55){
					MET=0;
					HET+=1;
				}
				else if (MET<=5)
					MET=0;
		
				Converte = HoraST.split(":");
				HST = Integer.parseInt(Converte[0]);
				MST = Integer.parseInt(Converte[1]);
				if (MST>=55){
					MST=0;
					HST+=1;
				}
				else if (MST<=5)
					MST=0;
				
				TotManha = (HSM - HEM)*60 + (MSM - MEM);
				TotTarde = (HST - HET)*60 + (MST - MET);
		
				BancoHoras += (TotManha-240)+(TotTarde-240);
			
			}
			//voltando para horas e minutos
			DuracaoH = BancoHoras / 60;
			DuracaoM = BancoHoras % 60;
			
			if(BancoHoras < 0)
				System.out.printf("- %02d:%02d\n",Math.abs(DuracaoH),Math.abs(DuracaoM)); // imprime o módulo do número
			else
				System.out.printf("+ %02d:%02d\n",DuracaoH,DuracaoM);
			
			DuracaoH=0;
			DuracaoM=0;
			BancoHoras=0;
			TotManha=0;
			TotTarde=0;
			
			QT--;
		}
		sc.close();
	}

}
