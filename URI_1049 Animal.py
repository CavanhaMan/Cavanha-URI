/*-------------------*
| Rodrigo CavanhaMan |
| URI 1049           |
| Animal             |
*--------------------*/
AN1 = input()
AN2 = input()
AN3 = input()
if AN1=="vertebrado":
	if AN2=="ave":
		if AN3=="carnivoro":
			print("aguia")
		else:
			print("pomba")
	else:
		if AN3=="onivoro":
			print("homem")
		else:
			print("vaca")
else:
	if AN2=="inseto":
		if AN3=="hematofago":
			print("pulga")
		else:
			print("lagarta")
	else:
		if AN3=="hematofago":
			print("sanguessuga")
		else:
			print("minhoca")