DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`   INT          not null auto_increment primary key,
    `name` VARCHAR(100) not null,
    `age`  INT          not null,
    `smth` VARCHAR(100) null
);

insert into employee (id, name, age, smth)
values (1, 'Hannah', 50, 'director'),
       (2, 'Mary', 17, 'hr'),
       (3, 'Joseph', 45, 'architect'),
       (4, 'Jose', 33, 'engineer'),
       (5, 'Dave', 45, 'sales'),
       (6, 'Maria', 31, 'hr');

values (1, 'Ravshan', 19, 'support'),
       (2, 'Jackie', 19, 'hr'),
       (3, 'Mohamed', 23, 'development'),
       (4, 'Alice', 18, 'management'),
       (5, 'Jack', 35, 'development'),
       (7, 'Mary', 20, 'qa'),
       (8, 'Anna', 30, 'hr'),
       (9, 'Kostik', 8765, 'development'),
       (10, 'Dzhumshut', 201, 'support'),
       (11, 'John', 1999, 'management'),
       (12, 'Sarah', 15000, 'management');