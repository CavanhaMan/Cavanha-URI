/*-------------------*
| Rodrigo CavanhaMan |
| URI 2542           |
| Iu-Di-Oh!          |
*--------------------*/
#include<iostream>
#include<vector>
using namespace std;
int main(){
	int n;	 //numero de atributos de cada carta
    while(cin>>n){
		int m; //numero de cartas de Marcos
		int l; //numero de cartas de Leonardo
        cin>>m>>l;
        vector<int>cartasM[m]; //cartas de Marcos
        vector<int>cartasL[l]; //cartas de Leonardo
		//entra cartas de Marcos
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                int a;
                cin>>a;
                cartasM[i].push_back(a);
            }
		//entra cartas de Leonardo
        for(int i=0;i<l;i++)
            for(int j=0;j<n;j++){
                int a;
                cin>>a;
                cartasL[i].push_back(a);
            }
        int cm; //cartas escolhidas por Marcos
		int cl; //cartas escolidas por Leonardo
		int a; //atributo sorteado
		cin>>cm>>cl>>a;
        long long Marcos   = cartasM[cm-1][a-1];
        long long Leonardo = cartasL[cl-1][a-1];
		if (Marcos > Leonardo)
			cout<<"Marcos\n";
		else if (Leonardo > Marcos)
			cout<<"Leonardo\n";
        else cout<<"Empate\n";
    }
    return 0;
}