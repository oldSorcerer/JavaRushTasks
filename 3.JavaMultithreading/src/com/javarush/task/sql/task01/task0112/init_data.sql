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
       (2, 'Jackie', 779, 'hr'),
       (3, 'Mohamed', 2333, 'development'),
       (4, 'Alice', 10000, 'management'),
       (5, 'Jack', 3500, 'development'),
       (7, 'Mary', 1595, 'qa'),
       (8, 'Anna', 1593, 'hr'),
       (9, 'Kostik', 8765, 'development'),
       (10, 'Dzhumshut', 201, 'support'),
       (11, 'John', 1999, 'management'),
       (12, 'Sarah', 15000, 'management')
;