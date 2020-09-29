/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2618            |
| Produtos Importados |
*---------------------*
nome dos produtos, o nome do fornecedor e o nome da categoria
para os produtos fornecidos pelo fornecedor ‘Sansul SA’ 
cujo nome da categoria seja 'Imported'.
*/
select p.name, pv.name, c.name
 from products p
 join providers pv on p.id_providers = pv.id
 join categories c on p.id_categories = c.id
 where c.name = 'Imported'
 and pv.name = 'Sansul SA';