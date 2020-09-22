/*-------------------*
| Rodrigo CavanhaMan |
| URI 2617           |
| Fornecedor Ajax SA |
*--------------------*
nome dos produtos e o nome do fornecedor, 
para os produtos fornecidos pelo fornecedor ‘Ajax SA’.
*/
select products.name, providers.name
 from products inner join providers
 on providers.id = products.id_providers
 where providers.name = 'Ajax SA';
