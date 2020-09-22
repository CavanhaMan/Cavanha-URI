/*-------------------*
| Rodrigo CavanhaMan |
| URI 2741           |
| Nota dos Alunos    |
*--------------------*
mostrar a frase 'Approved: ' junto com o nome do aluno
e a sua nota, para os alunos que foram aprovados (grade ≥7).
ordenar a lista pela maior nota.
*/
select CONCAT('Approved: ',name),grade
    from students
    where grade >=7
    order by 2 desc;
/*
SELECT CONCAT('<a href="', url, '">', title, '</a><br />') FROM links
*/