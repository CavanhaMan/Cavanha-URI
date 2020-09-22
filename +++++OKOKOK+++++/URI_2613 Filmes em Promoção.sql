/*
ID e o nome dos filmes cujo preço for menor que 2.00.

Rodrigo CavanhaMan
URI 2613
Filmes em Promoção
*/

select movies.id, movies.name
 from movies inner join prices
 on movies.id_prices = prices.id
 where prices.value < 2.00;
