/*-------------------*
| Rodrigo CavanhaMan |
| URI 2740           |
| Liga               |
*--------------------*
Selecione os três primeiros colocados da lista com a frase inicial Podium:
e também, os dois últimos times que serão rebaixados para série B com a frase inicial Demoted:
*/
(select 'Podium: ' || l1.team as name 
  FROM league l1
  limit 3)
union all
(select * from (
  select 'Demoted: ' || team as name
    FROM league
    order by position desc
    limit 2
    ) demoted
 order by 1);