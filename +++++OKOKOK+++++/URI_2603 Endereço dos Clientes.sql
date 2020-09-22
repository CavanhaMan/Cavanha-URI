/*
nomes e os endereços dos clientes que moram em 'Porto Alegre'

Rodrigo CavanhaMan
URI 2603
Endereço dos Clientes
*/

select customers.name, customers.street
 from customers 
 where customers.city = 'Porto Alegre';
