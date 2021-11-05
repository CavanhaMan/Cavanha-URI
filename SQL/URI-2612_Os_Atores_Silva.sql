/*-------------------*
| Rodrigo CavanhaMan |
| URI 2612           |
| Os atores Silva    |
*--------------------*
selecione o código e o nome dos filmes
 em que atuaram os atores 'Marcelo Silva' ou 'Miguel Silva'
 e que o gênero do filme seja 'Action'.
*/
select distinct m.id, m.name
 from movies m
 join movies_actors ma on ma.id_movies = m.id
 join actors a on ma.id_actors = a.id
 join genres g on m.id_genres = g.id
 where a.name = 'Marcelo Silva' or a.name = 'Miguel Silva'
 and g.description = 'Action';
