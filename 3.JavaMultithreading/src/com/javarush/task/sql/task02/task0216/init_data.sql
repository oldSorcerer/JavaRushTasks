DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`         INT          not null auto_increment primary key ,
    `name`       VARCHAR(100) not null,
    `position`   VARCHAR(100) not null,
    `department` VARCHAR(100) not null
);

insert into employee (id, name, position, department)
values (1, 'Steven', 'manager', 'cool devs'),
       (2, 'Jim', 'backend developer', 'cool devs'),
       (3, 'Daniel', 'frontend developer', 'cool devs'),
       (4, 'Vladlen', 'backend developer', 'cool devs'),
       (5, 'John', 'frontend developer', 'super devs'),
       (6, 'Amy', 'designer', 'cool devs'),
       (7, 'Andrew', 'backend developer', 'cool devs'),
       (8, 'Peter', 'backend developer', 'cool devs'),
       (9, 'Bob', 'frontend developer', 'super devs'),
       (10, 'Alex', 'manager', 'super devs');