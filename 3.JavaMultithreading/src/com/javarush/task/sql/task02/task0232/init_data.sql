DROP TABLE IF EXISTS 'students';

CREATE TABLE `students`
(
    `id`           INT          not null auto_increment,
    `name`         VARCHAR(100) not null,
    `age`          INT          not null,
    `is_full_time` INT          not null
);

insert into students (id, name, age, is_full_time)
values (11, 'Mary', 21, 0),
       (2, 'Peter', 24, 1),
       (5, 'Amy', 22, 0),
       (7, 'John', 19, 1),
       (6, 'Dexter', 40, 3),
       (1, 'Maria', 26, 1),
       (9, 'Alex', 21, 2);