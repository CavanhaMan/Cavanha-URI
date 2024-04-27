/*--------------------------*
| Rodrigo CavanhaMan        |
| BEE 2605                  |
| Representantes Executivos |
*---------------------------*
nomes dos produtos e dos fornecedores cujo código da categoria é 6.
*/
select products.name, providers.name
 from products, providers, categories
 where products.id_providers = providers.id
 and products.id_categories = categories.id
 and categories.id =6;

select products.name, providers.name
  from products p, providers f, categories c
  where p.id_providers = f.id
  and p.id_categories = c.id
  and c.id =6;

select products.name, providers.name
  from products p
  inner join providers f on p.id_providers = f.id
  inner join categories c on p.id_categories = c.id
  where c.id =6;