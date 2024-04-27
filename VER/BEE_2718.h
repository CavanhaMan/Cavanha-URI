#include <iostream>
#include<stdio.h>
#include<math.h>
#include<algorithm>
#include<stack>
#include<queue>
#include<set>
#include<map>
#include<vector>
#include<math.h>
#include<string>
#include<list>
using namespace std;
#define ll long long
#define input scanf
#define output printf 
#define Loop while
#define echo cout
#define ret return
#define MAX 999999999999999999
#define MIN 0
#define PI 3.1415

int main(int argc, char** argv) {
	
	//freopen("c.txt","w",stdout);
	int n;
	cin>>n;
	ll x;
	while(n--){
		cin>>x;
		ll aux=0;
		ll conta=0;
		ll resto;
		while(x>0){
			resto=x%2;
			x/=2;
			if(resto==1)conta++;
			else{
				if(conta>aux){
					aux=conta;
					conta=0;
				}
				conta=0;
			}
		}
		if(conta>aux){
					aux=conta;
					conta=0;
				}
		cout<<aux<<endl;
	}
	ret 0;
}