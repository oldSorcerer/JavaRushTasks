DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`   INT          not null auto_increment primary key,
    `name` VARCHAR(100) not null,
    `age`  INT          not null,
    `smth`   VARCHAR(100) null,
    `salary` INT          null
);

insert into employee (id, name, age, smth, salary)
values (1, 'Ravshan', 19, 'support', 45000),
       (2, 'Jackie', 19, 'hr', 48000),
       (3, 'Mohamed', 23, 'dev', 85000),
       (4, 'Alice', 18, 'management', 55000),
       (5, 'Jack', 35, 'development', 110000),
       (7, 'Mary', 20, 'qa', 60000),
       (8, 'Anna', 30, 'hr', 65000),
       (9, 'Kostik', 65, 'dev', 140000),
       (10, 'Dzhumshut', 21, 'support', 47000),
       (11, 'John', 19, 'management', 52000),
       (12, 'Sarah', 25, 'management', 75000),
       (13, 'Hannah', 50, 'director', 180000),
       (14, 'Mary', 17, 'hr', 42000),
       (15, 'Joseph', 45, 'architect', 150000),
       (16, 'Jose', 33, 'engineer', 95000),
       (17, 'Dave', 45, 'sales', 120000),
       (18, 'Maria', 31, 'hr', 68000);