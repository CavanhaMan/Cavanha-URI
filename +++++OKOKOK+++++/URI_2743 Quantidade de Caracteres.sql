/*
mostrar a quantidade de caracteres de cada nome em ordem decrescente pela quantidade de caracteres.

Rodrigo Cavanhaman
URI 2743
Quantidade de Caracteres
 */
select p.name, char_length(p.name) AS length
    from people p
    order by 2 desc;
