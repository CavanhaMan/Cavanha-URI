/*-------------------*
| Rodrigo CavanhaMan |
| URI 2606           |
| Categorias         |
*--------------------*
código e o nome dos produtos, cuja categoria inicie com 'super'.
*/
select products.id, products.name
 from products inner join categories
 on products.id_categories = categories.id
 where categories.name like 'super%';