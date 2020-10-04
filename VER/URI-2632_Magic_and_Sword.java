package projeto01;
/*-------------------*
| Rodrigo CavanhaMan |
| URI 2632           |
| Magic and Sword    |
*--------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//int t=sc.nextInt(); //casos de teste
		
	//PONTOS DO RETANGULO:______________________________
		String[] areaIn = sc.nextLine().split(" ");
		int w = Integer.parseInt(areaIn[0]);
		int h = Integer.parseInt(areaIn[1]);
		
		int rx0 = Integer.parseInt(areaIn[2]);
		int ry0 = Integer.parseInt(areaIn[3]);
		
		int rx1 = rx0+h;
		int ry1 = ry0;
		
		int rx2 = rx0+h;
		int ry2 = ry0+w;
		
		int rx3 = rx0;
		int ry3 = ry0+w;
		
	//PONTOS DO CIRCULO:________________________________
		String[] magiaIn = sc.nextLine().split(" "); 
		String magia = magiaIn[0];
		int r =  Integer.parseInt(magiaIn[1]); //nivel da magia = raio
		int cx0 =  Integer.parseInt(magiaIn[2]); //coordenada x centro circulo
		int cy0 =  Integer.parseInt(magiaIn[3]); //coordenada y centro circulo
		
		int cxtop = cx0+r;
		int cytop = cy0;
		
		int cxdown = cx0-r;
		int cydown = cy0;
		
		int cxleft = cx0;
		int cyleft = cy0-r;
		
		int cxright = cx0;
		int cyright = cy0+r;
		
		if (cx0==rx0 && cy0==ry0) System.out.println("colisao");
		if (cx0==rx1 && cy0==ry1) System.out.println("colisao");
		if (cx0==rx2 && cy0==ry2) System.out.println("colisao");
		if (cx0==rx3 && cy0==ry3) System.out.println("colisao");

		if (cx0+r==rx0 && cy0+r==ry0) System.out.println("colisao");
		if (cx0+r==rx1 && cy0+r==ry1) System.out.println("colisao");
		if (cx0+r==rx2 && cy0+r==ry2) System.out.println("colisao");
		if (cx0+r==rx3 && cy0+r==ry3) System.out.println("colisao");
		
		
		
		sc.close();
	}
}
/*
  //TESTA COLISÃO GERAL:
  if ((p3x >= f1x && p3x <= f2x && p3y >= f1y && p3y <= f4y) ||
      (p4x <= f2x && p4x >= f1x && p4y >= f2y && p4y <= f3y) ||
      (p2x >= f4x && p2x <= f3x && p2y <= f4y && p2y >= f1y) ||
      (p1x <= f3x && p1x >= f4x && p1y <= f3y && p1y >= f2y)) 
    {
      aviso.innerHTML = "_C O L I S Ã O !_";
      fantasma.src="fantasmaX.png";
      stopPacAuto();
  }
  else {
    aviso.innerHTML = "";
    fantasma.src="fantasma.png";
  }

*/

//fire
	//dano=200
	//l1=20
	//l2=30
	//l3=50

//water
	//dano=300
	//l1=20
	//l2=25
	//l3=40

//earth
	//dano=400
	//l1=25
	//l2=55
	//l3=70

//air
	//dano=100
	//l1=18
	//l2=38
	//l3=60
