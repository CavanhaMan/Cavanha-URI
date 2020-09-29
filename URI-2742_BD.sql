/*------------------------------*
| Rodrigo CavanhaMan            |
| URI 2742                      |
| Multiverso de Richard - TABLE |
*-------------------------------*
selecionar todos os possíveis Richards das dimensões C875 e C774,
junto a sua probabilidade de existência (o fator N) com a precisão de 3 casas decimais.
O fator N é calculado multiplicando o valor omega por 1.618
Os dados devem ser ordenados pelo menor valor do campo omega.
*/
create table dimensions(
  id int primary key not null,
  name varchar (5)
);
create table life_registry(
  id int primary key not null,
  name varchar (25),
  omega numeric (2,1),
  dimensions_id int,
  foreign key (dimensions_id) references dimensions (id)
);

insert into dimensions values
(1,'C774'),
(2,'C784'),
(3,'C794'),
(4,'C824'),
(5,'C875');

insert into life_registry values
(1,'Richard Postman',5.6,2),
(2,'Simple Jelly',1.4,1),
(3,'Richard Gran Master',2.5,1),
(4,'Richard Turing',6.4,4),
(5,'Richard Strall',1.0,3);
