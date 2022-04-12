--- URI Online Judge SQL
--- Copyright URI Online Judge
--- www.urionlinejudge.com.br
--- Problem 2997

CREATE TABLE departamento(
    cod_dep int,
    nome varchar(50),
    endereco varchar(50)
);

GRANT SELECT ON departamento TO sql_user;
-- ------------------------------------------------------------
CREATE TABLE dependente
(matr int, nome varchar(50), endereco varchar(50));

GRANT SELECT ON dependente TO sql_user;

-- ------------------------------------------------------------
CREATE TABLE desconto
(cod_desc int, nome varchar(50), tipo varchar(10), valor numeric);

GRANT SELECT ON desconto TO sql_user;

-- ------------------------------------------------------------
CREATE TABLE divisao
(cod_divisao int, nome varchar(50), endereco varchar(50), cod_dep int);

GRANT SELECT ON divisao TO sql_user;

-- ------------------------------------------------------------
CREATE TABLE emp_desc
(cod_desc int, matr int);

GRANT SELECT ON emp_desc TO sql_user;

-- ------------------------------------------------------------
CREATE TABLE emp_venc
(cod_venc int, matr int);

GRANT SELECT ON emp_venc TO sql_user;

-- ------------------------------------------------------------
CREATE TABLE empregado
(matr int, nome varchar(50), endereco varchar(50), data_lotacao timestamp, lotacao int,
gerencia_cod_dep int, lotacao_div int, gerencia_div int);

GRANT SELECT ON empregado TO sql_user;

-- ------------------------------------------------------------
CREATE TABLE vencimento
(cod_venc int, nome varchar(50), tipo varchar(10), valor numeric);

GRANT SELECT ON vencimento TO sql_user;

INSERT INTO departamento
("cod_dep", "nome", "endereco")
VALUES
(1, 'Contabilidade', 'R. X'),
(2, 'TI', 'R. Y'),
(3, 'Engenharia', 'R. Y');

INSERT INTO dependente
(matr, nome, endereco)
VALUES
(9999, 'Francisco Jose', 'R. Z'),
(88, 'Maria da Silva', 'R. T'),
(55, 'Virgulino da Silva', 'R. 31');

INSERT INTO desconto
(cod_desc, nome, tipo, valor)
VALUES
(91, 'IR', 'V', 400.00),
(92, 'Plano de saude', 'v', 300.00),
(93, NULL, NULL, NULL);

INSERT INTO divisao
(cod_divisao, nome, endereco, cod_dep)
VALUES
(11, 'Ativo', 'R. X', 1),
(12, 'Passivo', 'R. X', 1),
(21, 'Desenvoilvimento de Projetos', 'R. Y', 2),
(22, 'Analise de Sistemas', 'R. Y', 2),
(23, 'Programacao', 'R. W', 2),
(31, 'Concreto', 'R Y', 3),
(32, 'Calculo Estrutural', 'R. Y', 3);

INSERT INTO emp_desc
(cod_desc, matr)
VALUES
(91, 3),
(91, 27),
(91, 9999),
(92, 27),
(92, 71),
(92, 88),
(92, 9999);

INSERT INTO emp_venc
(cod_venc, matr)
VALUES
(1, 27),
(1, 88),
(1, 135),
(1, 254),
(1, 431),
(2, 1),
(2, 5),
(2, 7),
(2, 13),
(2, 33),
(2, 9999),
(3, 3),
(3, 55),
(3, 71),
(3, 222),
(4, 25),
(4, 476),
(5, 371),
(6, 3),
(6, 27),
(6, 9999),
(7, 5),
(7, 33),
(7, 55),
(7, 71),
(7, 88),
(7, 254),
(7, 476),
(8, 25),
(8, 91),
(9, 1),
(9, 27),
(9, 91),
(9, 135),
(9, 371),
(9, 9999),
(10, 371),
(10, 9999),
(11, 91),
(12, 3),
(12, 27),
(12, 254),
(12, 9999),
(13, 3),
(13, 5),
(13, 7),
(13, 25),
(13, 33),
(13, 88),
(13, 135);

INSERT INTO empregado
(matr, nome, endereco, data_lotacao, lotacao, gerencia_cod_dep, lotacao_div, gerencia_div)
VALUES
(9999, 'Jose Sampaio', 'R Z', '2006-06-06 00:00:00', 1, 1, 12, NULL),
(33, 'Jose Maria', 'R 21', '2006-03-01 00:00:00', 1, NULL, 11, 11),
(1, 'Maria Jose', 'R. 52', '2003-03-01 00:00:00', 1, NULL, 11, NULL),
(7, 'Yasmim', 'R. 13', '210-07-02 00:00:00', 1, NULL, 11, NULL),
(5, 'Rebeca', 'R. 1', '2011-04-01 00:00:00', 1, NULL, 12, 12),
(13, 'Sofia', 'R. 28', '2010-09-09 00:00:00', 1, NULL, 12, NULL),
(27, 'Andre', 'R. Z', '2005-05-01 00:00:00', 2, 2, 22, NULL),
(88, 'Yami', 'R. T', '2014-02-01 00:00:00', 2, NULL, 21, 21),
(431, 'Joao da Silva', 'R. Y', '2011-07-03 00:00:00', 2, NULL, 21, NULL),
(135, 'Ricardo Reis', 'R. 33', '2009-08-01 00:00:00', 2, NULL, 21, NULL),
(254, 'Barbara', 'R. Z', '2008-01-03 00:00:00', 2, NULL, 22, 22),
(371, 'Ines', 'R. Y', '2005-01-01 00:00:00', 2, NULL, 22, NULL),
(476, 'Flor', 'r. Z', '2015-10-28 00:00:00', 2, NULL, 23, 23),
(25, 'Lina', 'R. 67', '2014-09-01 00:00:00', 2, NULL, 23, NULL),
(3, 'Jose da Silva', 'R. 8', '2011-01-02 00:00:00', 3, 3, 31, NULL),
(71, 'Silverio dos Reis', 'r. C', '2009-01-05 00:00:00', 3, NULL, 31, 31),
(91, 'Reis da Silva', 'R. Z', '2011-11-05 00:00:00', 3, NULL, 31, NULL),
(55, 'Lucas', 'R 31', '2013-07-01 00:00:00', 3, NULL, 32, 32),
(222, 'Marina', 'R 31', '2015-01-07 00:00:00', 3, NULL, 32, NULL),
(725, 'Angelo', 'R. X', '2001-03-01 00:00:00', 2, NULL, 21, NULL);

INSERT INTO vencimento
(cod_venc, nome, tipo, valor)
VALUES
(1, 'salario base Analista de Sistemas', 'V', 5000.00),
(2, 'Salario base Contador', 'V', 3000.00),
(3, 'Salario Base Engenheiro', 'V', 4500.00),
(4, 'Salario Base Projetista Software', 'V', 5000.00),
(5, 'Salario Base Programador de Sistemas', 'V', 3000.00),
(6, 'Gratificacao Chefia Departamento', 'V', 3750.00),
(7, 'Gratificacao Chefia Divisao', 'V', 2200.00),
(8, 'Salario Trabalhador Costrucao Civil', 'V', 800.00),
(9, 'Auxilio Salario Familia', 'V', 300.00),
(10, 'Gratificacao Tempo de servico', 'V', 350.00),
(11, 'Insalubridade', 'V', 800.00),
(12, 'Gratificacao por titulacao - Doutorado', 'V', 2000.00),
(13, 'Gratificacao por Titularidade - Mestrado', 'V', 800.00);

/*  Execute this query to drop the tables */
-- DROP TABLE vencimento;
-- DROP TABLE empregado;
-- DROP TABLE emp_venc;
-- DROP TABLE emp_desc;
-- DROP TABLE divisao;
-- DROP TABLE desconto;
-- DROP TABLE dependente;
-- DROP TABLE departamento;