DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`         INT          not null auto_increment primary key,
    `name`       VARCHAR(100) not null,
    `rating`     INT          not null,
    `position`   VARCHAR(100) not null,
    `department` VARCHAR(100) not null
);

insert into employee (id, name, rating, position, department)
values (1, 'Tom', 1, 'backend developer', 'omega'),
       (2, 'Jim', 5, 'backend developer', 'bravo'),
       (3, 'Daniel', 4, 'frontend developer', 'delta'),
       (4, 'Amy', 3, 'backend developer', 'alpha'),
       (5, 'Lee', 5, 'backend developer', 'omega'),
       (6, 'Maria', 4, 'frontend developer', 'alpha'),
       (7, 'Julia', 2, 'designer', 'delta'),
       (8, 'Kim', 2, 'backend developer', 'alpha'),
       (9, 'Andy', 1, 'frontend developer', 'omega'),
       (10, 'Marcus', 5, 'manager', 'bravo'),
       (11, 'Bill', 4, 'manager', 'alpha'),
       (12, 'Oscar', 2, 'manager', 'delta'),
       (13, 'Alex', 3, 'frontend developer', 'alpha'),
       (14, 'Mohamed', 1, 'backend developer', 'delta'),
       (15, 'Luka', 2, 'backend developer', 'omega'),
       (16, 'Earl', 4, 'frontend developer', 'alpha'),
       (17, 'Albert', 1, 'designer', 'alpha'),
       (18, 'Robert', 5, 'backend developer', 'delta'),
       (19, 'Joe', 5, 'frontend developer', 'omega'),
       (20, 'Timothy', 2, 'manager', 'bravo'),
       (21, 'Nicholas', 3, 'designer', 'omega');