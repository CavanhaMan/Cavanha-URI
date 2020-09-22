/*
Exibir o nome de todos os clientes cujo estado seja ‘RS’.

Rodrigo CavanhaMan
URI 2621
Quantidades entre 10 e 20
*/
select customers.name 
 from customers
 where customers.state like 'RS%';