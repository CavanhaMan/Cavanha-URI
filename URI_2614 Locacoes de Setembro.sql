/*---------------------*
| Rodrigo CavanhaMan   |
| URI 2614             |
| Locações de Setembro |
*----------------------*
nome dos clientes e a data de locação
das locações realizadas no mês de setembro de 2016.
*/
select customers.name, rentals.rentals_date
 from customers inner join rentals
 on customers.id = rentals.id_customers
 where rentals.rentals_date between to_date('2016-09-01','YYYY-MM-DD') and to_date('2016-09-30','YYYY-MM-DD');