DROP TABLE IF EXISTS 'employee';

CREATE TABLE `employee`
(
    `id`   INT          not null auto_increment,
    `name` VARCHAR(100) not null,
    `age`  INT          not null,
    `smth` VARCHAR(100) null
);

insert into employee (id, name, age, smth)
values (1, 'John', 23, 'director'),
       (2, 'Dave', 45, 'sales'),
       (4, 'Maria', 31, 'hr');