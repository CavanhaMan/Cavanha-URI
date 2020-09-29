/*-------------------------------*
| Rodrigo CavanhaMan             |
| URI 2623                       |
| Categorias com Vários Produtos |
*--------------------------------*
nome do produto e o nome da categoria
para os produtos cuja quantidade seja maior que 100
e o código da categoria seja 1,2,3,6 ou 9.
*/
select p.name, c.name
 from products p
 join categories c on p.id_categories = c.id
 where p.amount > 100
 and c.id in (1,2,3,6, 9)
 order by c.id;