/*-------------------*
| Rodrigo CavanhaMan |
| URI 2737           |
| Advogados          |
*--------------------*
nome do advogado que têm mais clientes
o nome do advogado que tem menos clientes
a média de clientes entre todos os advogados

mostre um campo chamado Average com média em inteiros.
*/
select name, customers_number 
	from lawyers
	where customers_number = ( select max(customers_number) from lawyers )
	union all
select name, customers_number
	from lawyers
	where customers_number = ( select min(customers_number) from lawyers )
	union all
select 'Average', round(avg(customers_number),0) from lawyers;