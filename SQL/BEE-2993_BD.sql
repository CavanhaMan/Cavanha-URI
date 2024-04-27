--- URI Online Judge SQL
--- Copyright URI Online Judge
--- www.urionlinejudge.com.br
--- Problem 2993

CREATE TABLE value_table (
    amount integer
);

GRANT SELECT ON value_table TO sql_user;

insert into
value_table (amount)
values
(4),(6),(7),(1),(1),(2),(3),(2),(3),(1),(5),(6),(1),(7),(8),(9),(10),(11),(12),(4),(5),(5),(3),(6),(2),(2),(1);

/*  Execute this query to drop the tables */
-- DROP TABLE value_table;