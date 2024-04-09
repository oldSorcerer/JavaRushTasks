DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`         INT          not null auto_increment primary key,
    `name`       VARCHAR(100) not null,
    `position`   VARCHAR(100) not null,
    `department` VARCHAR(100) not null
);

insert into employee (id, name, position, department)
values (1, 'Tom', 'backend developer', 'omega'),
       (2, 'Jim', 'manager', 'bravo'),
       (3, 'Daniel', 'frontend developer', 'delta'),
       (4, 'Amy', 'backend developer', 'alpha'),
       (5, 'Lee', 'backend developer', 'omega'),
       (6, 'Maria', 'frontend developer', 'alpha'),
       (7, 'Julia', 'designer', 'delta'),
       (8, 'Kim', 'backend developer', 'alpha'),
       (9, 'Andy', 'frontend developer', 'omega'),
       (10, 'Marcus', 'manager', 'bravo'),
       (11, 'Bill', 'manager', 'alpha'),
       (12, 'Oscar', 'manager', 'delta'),
       (13, 'Alex', 'frontend developer', 'alpha'),
       (14, 'Mohamed', 'backend developer', 'delta'),
       (15, 'Luka', 'backend developer', 'omega'),
       (16, 'Earl', 'frontend developer', 'alpha'),
       (17, 'Albert', 'designer', 'alpha'),
       (18, 'Robert', 'backend developer', 'delta'),
       (19, 'Joe', 'frontend developer', 'omega'),
       (20, 'Timothy', 'manager', 'bravo'),
       (21, 'Nicholas', 'designer', 'omega');