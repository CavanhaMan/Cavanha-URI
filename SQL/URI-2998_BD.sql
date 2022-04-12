--- URI Online Judge SQL
--- Copyright URI Online Judge
--- www.urionlinejudge.com.br
--- Problem 2998

CREATE TABLE clients (
    id integer PRIMARY KEY,
    name varchar(50),
    investment numeric
);

GRANT SELECT ON clients TO sql_user;

CREATE TABLE operations (
    id integer PRIMARY KEY,
    client_id integer,
    month integer,
    profit numeric,
    FOREIGN KEY (client_id) REFERENCES clients(id)
);

GRANT SELECT ON operations TO sql_user;insert into clients (id,name,investment) values
(1,'Daniel',500),
(2,'Oliveira',2000),
(3,'Lucas',1000);


INSERT INTO operations (id, client_id, month, profit) VALUES
(1,1,1,230),
(2,2,1,1000),
(3,2,2,1000),
(4,3,1,100),
(5,3,2,300),
(6,3,3,900),
(7,3,4,400);

/*  Execute this query to drop the tables */
-- DROP TABLE operations;
-- DROP TABLE clients;
