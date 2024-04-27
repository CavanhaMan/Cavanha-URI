/*-------------------*
| Rodrigo CavanhaMan |
| BEE 1040           |
| Media              |
*--------------------*/
#include<stdio.h>
using namespace std;

int main() {

	float n1,n2,n3,n4,media,emexame,emexamefinal;

	scanf("%f",&n1);
	scanf("%f",&n2);
	scanf("%f",&n3);
	scanf("%f",&n4);

	media = (n1*2 + n2*3 + n3*4 + n4*1 )/10;

	printf("Media: %.1f\n",media);

	if (media >= 7.0)
		printf("Aluno aprovado.\n");	
	else if (media < 5.0)
		printf("Aluno reprovado.\n");	
	else {
		printf("Aluno em exame.\n");
		scanf("%f",&emexame);
		printf("Nota do exame: %.1f\n",emexame);
		emexamefinal = ((media + emexame) / 2); 
		if(emexamefinal >= 5.0){
		printf("Aluno aprovado.\n");
		printf("Media final: %.1f\n",emexamefinal);
		}
		else{
		printf("Aluno reprovado.\n");
		printf("Media final: %.1f\n",emexamefinal);
		}
	}

	return 0;
}
