/*
código e o nome dos filmes cuja descrição do gênero seja 'Action'.

Rodrigo CavanhaMan
URI 2611
Filmes de Ação
*/

select m.id, m.name
 from movies m inner join genres g
 on m.id_genres = g.id
 where g.description = 'Action';