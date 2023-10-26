DROP TABLE IF EXISTS 'employee';

CREATE TABLE `employee`
(
       `id`            INT          not null auto_increment,
       `name`          VARCHAR(100) not null,
       `date_of_birth` DATE         not null,
       `position`      VARCHAR(100) not null,
       `department`    VARCHAR(100) not null
);

insert into employee (id, name, date_of_birth, position, department)
values (1, 'Tom', '1985-10-05', 'backend developer', 'omega'),
       (2, 'Jim', '1979-11-24', 'manager', 'bravo'),
       (3, 'Daniel', '2000-07-09', 'frontend developer', 'delta'),
       (4, 'Amy', '1995-05-22', 'backend developer', 'alpha'),
       (5, 'Lee', '2001-07-11', 'backend developer', 'omega'),
       (6, 'Maria', '2000-11-01', 'frontend developer', 'alpha'),
       (7, 'Julia', '2001-01-30', 'designer', 'delta'),
       (8, 'Kim', '1986-05-01', 'backend developer', 'alpha'),
       (9, 'Andy', '1999-10-22', 'frontend developer', 'omega'),
       (10, 'Marcus', '1995-01-13', 'manager', 'bravo'),
       (11, 'Bill', '1990-08-08', 'manager', 'alpha'),
       (12, 'Oscar', '1980-03-27', 'manager', 'delta'),
       (13, 'Alex', '2002-03-30', 'frontend developer', 'alpha'),
       (14, 'Mohamed', '1992-06-28', 'backend developer', 'delta'),
       (15, 'Luka', '1984-09-17', 'backend developer', 'omega'),
       (16, 'Earl', '2001-04-11', 'frontend developer', 'alpha'),
       (17, 'Albert', '2000-07-07', 'designer', 'alpha'),
       (18, 'Robert', '1990-08-26', 'backend developer', 'delta'),
       (19, 'Joe', '1993-02-09', 'frontend developer', 'omega'),
       (20, 'Timothy', '1995-03-25', 'manager', 'bravo'),
       (21, 'Nicholas', '2000-01-05', 'designer', 'omega')
;