--- URI Online Judge SQL
--- Copyright URI Online Judge
--- www.urionlinejudge.com.br
--- Problem 2607

CREATE TABLE providers (
  id numeric PRIMARY KEY,
  name varchar(50),
  street varchar(50),
  city varchar(50),
  state varchar(2)
);

INSERT INTO providers (id, name, street, city, state)
VALUES 
  (1,	'Henrique',	'Av Brasil',	'Rio de Janeiro',	'RJ'),
  (2,	'Marcelo Augusto',	'Rua Imigrantes',	'Belo Horizonte',	'MG'),
  (3,	'Caroline Silva',	'Av São Paulo',	'Salvador',	'BA'),
  (4,	'Guilerme Staff',	'Rua Central',	'Porto Alegre',	'RS'),
  (5,	'Isabela Moraes',	'Av Juiz Grande',	'Curitiba',	'PR'),
  (6,	'Francisco Accerr',	'Av Paulista',	'São Paulo',	'SP');
  
  /*  Execute this query to drop the tables */
  -- DROP TABLE providers; --
    
