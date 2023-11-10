DROP TABLE IF EXISTS customers;

CREATE TABLE customers
(
    `id`   INT          not null auto_increment primary key ,
    `name` VARCHAR(100) not null,
    `age`  INT          not null,
    `city` VARCHAR(200) not null
);
insert into customers (id, name, age, city)
values (9, 'Jack', 5, 'New York'),
       (3, 'Sven', 20, 'Oslo'),
       (13, 'Jose', 43, 'Madrid'),
       (20, 'Olivia', 21, 'Australia'),
       (77, 'Lukas', 19, 'Austria'),
       (58, 'Aleksi', 25, 'Finland'),
       (2, 'Alexander', 33, 'Germany'),
       (55, 'Joao', 71, 'Portugal'),
       (33, 'Isak', 38, 'Sweden'),
       (99, 'Monika', 62, 'Warsaw'),
       (111, 'Amelie', 1, 'London')
;