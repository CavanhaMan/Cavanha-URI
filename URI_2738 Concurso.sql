/*-------------------*
| Rodrigo CavanhaMan |
| URI 2738           |
| Concurso           |
*--------------------*/
select c.name, round((((s.math*2)+(s.specific*3)+(s.project_plan*5))/10),2) AS avg
	from score s inner join candidate c
    on c.id = s.candidate_id
    order by 2 desc;

/*
SELECT ROUND(235.415, 2) AS RoundValue;
*/