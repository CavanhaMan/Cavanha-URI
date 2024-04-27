/*-------------------*
| Rodrigo CavanhaMan |
| URI 1049           |
| Animal             |
*--------------------*/
#include<stdio.h>
#include <iostream>
#include <string>
using namespace std;

int main() {

	string AN1, AN2, AN3;
	getline(cin, AN1);
	getline(cin, AN2);
	getline(cin, AN3);

	if (AN1=="vertebrado") {
		if (AN2=="ave") {
			if (AN3=="carnivoro") 
				cout << "aguia\n";
			else
				cout << "pomba\n";
		}
		else {
			if (AN3=="onivoro")
				cout << "homem\n";
			else
				cout << "vaca\n";
		}
	}
	else {
		if (AN2=="inseto") {
			if (AN3=="hematofago")
				cout << "pulga\n";
			else
				cout << "lagarta\n";
		}
		else {
			if (AN3=="hematofago")
				cout << "sanguessuga\n";
			else
				cout << "minhoca\n";
		}
	}
	return 0;
}
