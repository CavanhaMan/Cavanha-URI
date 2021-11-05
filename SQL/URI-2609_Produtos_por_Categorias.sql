/*------------------------*
| Rodrigo CavanhaMan      |
| URI 2609                |
| Produtos por Categorias |
*-------------------------*
nome e a quantidade de produtos de cada uma categoria.
*/
select categories.name, sum(products.amount)
 from products, categories
 where products.id_categories = categories.id
 group by categories.name;