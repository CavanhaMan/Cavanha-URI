/*
quantas cidades a empresa já alcançou.
você deve exibir a quantidade de cidades distintas da tabela clientes.

Rodrigo CavanhaMan
URI 2624
Quantidades de Cidades por Clientes
*/
select count (distinct c.city)
    from customers c;

