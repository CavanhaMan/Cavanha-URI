/*--------------------*
| Rodrigo CavanhaMan  |
| URI  2603           |
|Endereço dos Clientes|
*---------------------*
Nomes e os endereços dos clientes que moram em 'Porto Alegre'
*/

select customers.name, customers.street
 from customers 
 where customers.city = 'Porto Alegre';
