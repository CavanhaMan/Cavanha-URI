/*-------------------*
| Rodrigo CavanhaMan |
| URI 2619           |
| Super Luxo         |
*--------------------*
nome dos produtos, nome dos fornecedores e o preço
para os produtos cujo preço seja maior que 1000
e sua categoria seja ‘Super Luxury.
*/
select p.name, pv.name, p.price
 from products p
 join providers pv on p.id_providers = pv.id
 join categories c on p.id_categories = c.id
 where c.name = 'Super Luxury'
 and p.price > 1000;