/*-------------------*
| Rodrigo CavanhaMan |
| URI 2338           |
| Codigo Morse       |
*--------------------*/
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,c=0;
    string x,y;
    cin>>n;
    for (int i=0;i<n;i++){
        cin>>x;
        for (int a=0;a<x.size();a++){
            if ((x[a]=='.'&&x[a+1]=='.'&&x[a+2]=='.')||(a==x.size()-1)) {
	            if (a==x.size()-1) y=x.substr(c,a-c+1);
	            else y=x.substr(c,a-c);
	            if (y=="=.===") cout<<"a";
	            else if (y=="===.=.=.=") cout<<"b";
	            else if (y=="===.=.===.=") cout<<"c";
	            else if (y=="===.=.=") cout<<"d";
	            else if (y=="=") cout<<"e";
	            else if (y=="=.=.===.=") cout<<"f";
	            else if (y=="===.===.=") cout<<"g";
	            else if (y=="=.=.=.=") cout<<"h";
	            else if (y=="=.=") cout<<"i";
	            else if (y=="=.===.===.===") cout<<"j";
	            else if (y=="===.=.===") cout<<"k";
	            else if (y=="=.===.=.=") cout<<"l";
	            else if (y=="===.===") cout<<"m";
	            else if (y=="===.=") cout<<"n";
	            else if (y=="===.===.===") cout<<"o";
	            else if (y=="=.===.===.=") cout<<"p";
	            else if (y=="===.===.=.===") cout<<"q";
	            else if (y=="=.===.=") cout<<"r";
	            else if (y=="=.=.=") cout<<"s";
	            else if (y=="===") cout<<"t";
	            else if (y=="=.=.===") cout<<"u";
	            else if (y=="=.=.=.===") cout<<"v";
	            else if (y=="=.===.===") cout<<"w";
	            else if (y=="===.=.=.===") cout<<"x";
	            else if (y=="===.=.===.===") cout<<"y";
	            else if (y=="===.===.=.=") cout<<"z";
	            if (x[a+3]=='.'&&x[a+4]=='.'&&x[a+5]=='.'&&x[a+6]=='.'){
	           		cout<<" ";
	            	c=a+7;
            		a+=6;
				}
            	else {
					c=a+3;
            		a+=2;
				}
			}
        }
        c=0;
        cout<<endl;
    }
    return 0;
}

