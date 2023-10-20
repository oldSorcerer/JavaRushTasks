DROP TABLE IF EXISTS 'developers';

CREATE TABLE `developers`
(
    `id`         INT          not null auto_increment,
    `name`       VARCHAR(100) not null,
    `age`        INT          not null,
    `experience` INT          not null
);

insert into developers (id, name, age, experience)
values (11, 'Mary', 21, 1),
       (2, 'Peter', 24, 3),
       (5, 'Amy', 22, 0),
       (7, 'John', 15, 0),
       (6, 'Dexter', 40, 15),
       (1, 'Maria', 26, 2),
       (9, 'Alex', 23, 4);