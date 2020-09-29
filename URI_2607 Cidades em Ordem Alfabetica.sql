/*----------------------------*
| Rodrigo CavanhaMan          |
| URI 2607                    |
| Cidades em Ordem Alfabética |
*-----------------------------*
cidades dos fornecedores em ordem alfabética
sem repetição
*/
select distinct providers.city
 from providers
 order by providers.city;