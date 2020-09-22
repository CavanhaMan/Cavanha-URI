/*--------------------------*
| Rodrigo CavanhaMan        |
| URI 2605                  |
| Representantes Executivos |
*---------------------------*
nomes dos produtos e dos fornecedores cujo código da categoria é 6.
*/
select products.name, providers.name
 from products, providers, categories
 where products.id_providers = providers.id
 and products.id_categories = categories.id
 and categories.id =6;