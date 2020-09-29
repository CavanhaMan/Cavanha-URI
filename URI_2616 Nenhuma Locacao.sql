/*-------------------*
| Rodrigo CavanhaMan |
| URI 2616           |
| Nenhuma Locação    |
*--------------------*
ID e o nome dos clientes que não realizaram nenhuma locação.
*/ 
select c.id, c.name
    from customers c
    /*join locations l on l.id_customers = c.id*/
    where c.id not in (select l.id_customers from locations l)
    order by c.id; 

/*
Select * from funcionario where CODFUNC not in (select CODFUNC from FILIAIS)
*/