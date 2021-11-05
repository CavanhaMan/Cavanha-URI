/*-------------------*
| Rodrigo CavanhaMan |
| URI 2602           |
| Select Basico      |
*--------------------*
Exibir o nome de todos os clientes cujo estado seja ‘RS’.
Quantidades entre 10 e 20
*/
select customers.name 
 from customers
 where customers.state like 'RS%';

#--------------------------------------

select customers.name from customers
 where customers.state = 'RS';
