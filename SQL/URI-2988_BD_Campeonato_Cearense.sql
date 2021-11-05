/*--------------------*
| Rodrigo CavanhaMan  |
| URI 2988            |
| Campeonato Cearense |
*---------------------*
Mostre uma tabela com as seguintes colunas: 
o nome do time, número de partidas, vitórias, derrotas, empates e pontuação.
Sabendo que a pontuação é calculada com cada vitória valendo 3 pontos, 
empate vale 1 e derrota rende 0. No final mostre sua tabela com a 
pontuação ordenada do maior para o menor.*/

select t.name,m.matches		#,victories,defeats,draws,score
from matches m
inner join teams t on t.id = m.team_1;



SELECT teams.name,count(name) as matches, 
 count( CASE WHEN (team_1_goals > team_2_goals and teams.id = team_1) or (team_2_goals > team_1_goals and teams.id = team_2) then 1 end ) as victories, 
 count( CASE WHEN (team_1_goals > team_2_goals and teams.id = team_2) or (team_2_goals > team_1_goals and teams.id = team_1) then 1 end ) as defeats, 
 count( CASE WHEN (team_1_goals = team_2_goals and teams.id = team_1) or (team_1_goals = team_2_goals and teams.id = team_2) then 1 end) as draws, 
 count( CASE WHEN (team_1_goals > team_2_goals and teams.id = team_1) or (team_2_goals > team_1_goals and teams.id = team_2) then 1 end ) + 
 count( case when (team_1_goals < team_2_goals and teams.id = team_1) or (team_2_goals < team_1_goals and teams.id = team_2) then 1 end ) +
 count( case when team_1_goals = team_2_goals then 1 end) * 1 as score 
 FROM teams 
 INNER JOIN matches ON teams.id = matches.team_1 or teams.id = matches.team_2 
 group by teams.id 
 order by score DESC, name ;
 
 
select teams.name , count(teams.id) as matches,
	count( CASE WHEN (team_1_goals > team_2_goals and teams.id = team_1) or (team_2_goals > team_1_goals and teams.id = team_2) then 1 end ) as victories ,
	count( case when (team_1_goals < team_2_goals and teams.id = team_1) or (team_2_goals < team_1_goals and teams.id = team_2) then 1 end ) as defeats ,
	count( case when team_1_goals = team_2_goals then 1 end) as draws,
	count( CASE WHEN (team_1_goals > team_2_goals and teams.id = team_1) or (team_2_goals > team_1_goals and teams.id = team_2) then 1 end )* 3 +
	count( case when (team_1_goals < team_2_goals and teams.id = team_1) or (team_2_goals < team_1_goals and teams.id = team_2) then 1 end ) * 0 +
	count( case when team_1_goals = team_2_goals then 1 end) * 1 as score 
 from teams
	join matches ON teams.id = matches.team_1 or teams.id = matches.team_2
	group by teams.id 
	order by score DESC, name;

#order by score desc, teams.name. Aí passou ok.

