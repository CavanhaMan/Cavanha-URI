--- URI Online Judge SQL
--- Copyright URI Online Judge
--- www.urionlinejudge.com.br
--- Problem 2996

CREATE TABLE users (
id integer PRIMARY KEY,
name varchar(50),
address varchar(50)
);

GRANT SELECT ON users TO sql_user;

CREATE TABLE packages (
id_package integer PRIMARY KEY,
id_user_sender integer,
id_user_receiver integer,
color varchar(50),
year integer,
FOREIGN KEY (id_user_sender) REFERENCES users(id),
FOREIGN KEY (id_user_receiver) REFERENCES users(id)
);

GRANT SELECT ON packages TO sql_user;

insert into users (id,name,address) values
(1,'Edgar Codd','England'),
(2,'Peter Chen','Taiwan'),
(3,'Jim Gray','United States'),
(4,'Elizabeth ONeil','United States');

insert into packages (id_package,id_user_sender,id_user_receiver,color,year) values
(1,1,2,'blue',2015),
(2,1,3,'blue',2019),
(3,2,4,'red',2019),
(4,2,1,'green',2018),
(5,3,4,'red',2015),
(6,4,3,'blue',2019);

/*  Execute this query to drop the tables */
-- DROP TABLE packages;
-- DROP TABLE users;
