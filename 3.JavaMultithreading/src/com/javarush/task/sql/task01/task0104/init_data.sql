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
       (2, 'Mary', 35, 'hr'),
       (3, 'Joseph', 45, 'architect'),
       (4, 'Jose', 33, 'engineer');