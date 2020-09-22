/*
nome e a quantidade de produtos de cada uma categoria.

Rodrigo CavanhaMan
URI 2609
Produtos por Categorias
*/

select categories.name, sum(products.amount)
 from products, categories
 where products.id_categories = categories.id
 group by categories.name;