DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`   INT          not null auto_increment primary key,
    `name` VARCHAR(100) not null,
    `age`  INT          not null,
    `smth` VARCHAR(100) null
);

insert into employee (id, name, age, smth)
values (1, 'Ravshan', 19, 'support'),
       (2, 'Jackie', 19, 'hr'),
       (3, 'Mohamed', 23, 'dev'),
       (4, 'Alice', 18, 'management'),
       (5, 'Jack', 35, 'development'),
       (7, 'Mary', 20, 'qa'),
       (8, 'Anna', 30, 'hr'),
       (9, 'Kostik', 65, 'dev'),
       (10, 'Dzhumshut', 21, 'support'),
       (11, 'John', 19, 'management'),
       (12, 'Sarah', 25, 'management'),
       (13, 'Hannah', 50, 'director'),
       (14, 'Mary', 17, 'hr'),
       (15, 'Joseph', 45, 'architect'),
       (16, 'Jose', 33, 'engineer'),
       (17, 'Dave', 45, 'sales'),
       (18, 'Maria', 31, 'hr');