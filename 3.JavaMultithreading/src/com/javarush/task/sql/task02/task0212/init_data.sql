DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`       INT          not null auto_increment primary key ,
    `position` VARCHAR(100) not null,
    `salary`   INT          not null,
    `city`     VARCHAR(200) not null
);
insert into employee (id, position, salary, city)
values (1, 'developer', 6000, 'London'),
       (3, 'hr', 2500, 'Berlin'),
       (4, 'manager', 4300, 'London'),
       (2, 'manager', 5000, 'Warsaw'),
       (7, 'designer', 2500, 'London'),
       (8, 'qa', 2000, 'Bucharest'),
       (9, 'developer', 3300, 'London'),
       (15, 'designer', 7100, 'Stockholm'),
       (16, 'courier', 3800, 'Warsaw'),
       (19, 'designer', 6200, 'Berlin'),
       (20, 'manager', 11000, 'London')
;