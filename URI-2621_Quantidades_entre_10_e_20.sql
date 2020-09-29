/*--------------------------*
| Rodrigo CavanhaMan        |
| URI 2621                  |
| Quantidades entre 10 e 20 |
*---------------------------*
Exiba o nome dos produtos 
cujas quantidades estejam entre 10 e 20 
e cujo nome do fornecedor inicie com a letra ‘P’.
*/
select products.name 
 from products inner join providers on products.id_providers = providers.id 
 where providers.name like 'P%'
 and products.amount between 10 and 20;
