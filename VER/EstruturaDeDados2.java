/*
+------------------+
|Rodrigo CavanhaMan|
|Estudos com Listas|
+------------------+
https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exemplo {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    // [ A ] declarando e instanciando uma agenda de contatos
    ArrayList<String> agenda = new ArrayList();

    // [ B ] usando o m�todo add() para gravar 4 contatos na agenda
    agenda.add("Juca Bala;11 1111-1111");
    agenda.add("Marcos Paqueta;22 2222-2222");
    agenda.add("Maria Antonieta;33 3333-3333");
    agenda.add("Ant�nio Conselheiro;44 4444-4444");

    int i;

    // [ C ] mostrando os "n" contatos da agenda (usando o �ndice)
    // n�mero de elementos da agenda: m�todo size()
    System.out.printf("Percorrendo o ArrayList (usando o �ndice)\n");
    int n = agenda.size();
    for (i=0; i<n; i++) {
      System.out.printf("Posi��o %d- %s\n", i, agenda.get(i));
    }

    System.out.printf("\nInforme a posi��o a ser exclu�da:\n");
    i = ler.nextInt();

    try {
      // [ D ] remove o i-�simo contato da agenda
      agenda.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exce��o lan�ada para indicar que um �ndice (i)
        // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
        System.out.printf("\nErro: posi��o inv�lida (%s).",
          e.getMessage());
    }

    // [ E ] mostrando os "n" contatos da agenda (usando for-each)
    System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
    i = 0;
    for (String contato: agenda) {
      System.out.printf("Posi��o %d- %s\n", i, contato);
      i++;
    }

    // [ F ] mostrando os "n" contatos da agenda (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    i = 0;
    Iterator<String> iterator = agenda.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posi��o %d- %s\n", i, iterator.next());
      i++;
    }
  }

}