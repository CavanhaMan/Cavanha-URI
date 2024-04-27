/*-------------------*
| Rodrigo CavanhaMan |
| BEE 2611           |
| Filmes de Ação     |
*--------------------*
código e o nome dos filmes cuja descrição do gênero seja 'Action'.
*/
select m.id, m.name
 from movies m 
 inner join genres g on m.id_genres = g.id
 where g.description = 'Action';

select movies.id, movies.name
  from movies 
  inner join genres on movies.id_genres = genres.id
  where genres.description = 'Action';