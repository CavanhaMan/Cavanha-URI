/*-------------------*
| Rodrigo CavanhaMan |
| URI 2248           |
| Estagio            |
*--------------------*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantos = sc.nextInt();
		int turma = 1;
		while (quantos != 0) {
			List<Aluno> alunos = new ArrayList<>();
			int maiorMedia = 0;
			for (int i = 0; i < quantos;i++) {
				Aluno aluno = new Aluno();
				aluno.sc = sc.nextInt();
				aluno.media = sc.nextInt();
				if (aluno.media > maiorMedia)
					maiorMedia = aluno.media;

				alunos.add(aluno);
			}
			System.out.println("Turma "+turma);
			for (Aluno aluno: alunos) 
				if (aluno.media == maiorMedia)
					System.out.print(aluno.sc+" ");

			System.out.println("");
			System.out.println("");
			turma++;
			quantos = sc.nextInt();
		}
		sc.close();
	}
}

class Aluno {
	int sc;
	int media;
}