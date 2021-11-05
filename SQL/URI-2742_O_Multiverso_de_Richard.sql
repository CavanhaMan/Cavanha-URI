/*----------------------*
| Rodrigo CavanhaMan    |
| URI 2742              |
| Multiverso de Richard |
*-----------------------*
selecionar todos os possíveis Richards das dimensões C875 e C774,
junto a sua probabilidade de existência (o fator N) com a precisão de 3 casas decimais.
O fator N é calculado multiplicando o valor omega por 1.618
Os dados devem ser ordenados pelo menor valor do campo omega.
*/
select l.name, round((l.omega*1.618),3) AS "Fator N"
    from life_registry l
    inner join dimensions d on l.dimensions_id = d.id
    where d.name in ('C875', 'C774')
    and l.name like 'Richar%'
    order by 2;
