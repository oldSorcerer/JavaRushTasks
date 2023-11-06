DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`         INT          not null auto_increment primary key,
    `name`       VARCHAR(100) not null,
    `salary`     INT          not null,
    `department` VARCHAR(200) null
);

insert into employee (id, name, salary, department)
values (1, 'Ravshan', 199, 'support'),
       (2, 'Jackie', 999, 'qa'),
       (3, 'Mohamed', 1001, 'dev'),
       (4, 'Alice', 3000, 'management'),
       (5, 'Jack', 1000, 'dev'),
       (7, 'Mary', 700, 'qa'),
       (8, 'Anna', 1593, 'hr'),
       (9, 'Kostik', 8765, 'dev'),
       (10, 'Dzhumshut', 201, 'support'),
       (11, 'John', 4500, 'management'),
       (12, 'Sarah', 5000, 'management')
       (13, 'Peter', 4999, 'sales')
       (14, 'John', 5001, 'dev')
       (15, 'Ema', 2500, 'qa')
;