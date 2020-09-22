
include
int conjs[5000][5000], ne[5000], n, i, nc, j, k, no, op, c1, c2, ele=0, el;


int main(){ scanf("%d", &n); while(scanf("%d", &nc)!=EOF){

	for(j=1; j<=nc;	j++){
		scanf("%d", &ne[j]);
		for(k=1; k<=ne[j];k++){
			scanf("%d", &el);
			conjs[j][el] = 1;
		}
	} 
	scanf("%d", &no);
	for(j=0; j<no; j++){
		scanf("%d %d %d", &op, &c1, &c2);

		if(op == 1)
			for(k=1;k<62;k++)
				if(conjs[c1][k]==1 && conjs[c2][k]==1)
					ele = ele +1;

		if(op == 2)
			for(k=1;k<62;k++)
				if(conjs[c1][k] == 1 || conjs[c2][k]== 1)
					ele = ele +1;

		printf("%d\n", ele);
		ele = 0;
	}
	for(j=1;j<=nc;j++)
		for(k=1;k<=62;k++)
			conjs[j][k]=0;

	return 0;

}