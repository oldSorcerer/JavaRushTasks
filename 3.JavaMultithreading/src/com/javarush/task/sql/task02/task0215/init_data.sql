DROP TABLE IF EXISTS 'months';

CREATE TABLE `months`
(
    `id`               INT          not null auto_increment,
    `title`            VARCHAR(100) not null,
    `days`             INT          not null,
    `number_of_season` INT          not null
);

insert into months (id, title, days, number_of_season)
values (1, 'January', 31, 1),
       (2, 'February', 28, 1),
       (3, 'March', 31, 2),
       (4, 'April', 30, 2),
       (5, 'May', 31, 2),
       (6, 'June', 30, 3),
       (7, 'July', 31, 3),
       (8, 'August', 31, 3),
       (9, 'September', 30, 4),
       (10, 'October', 31, 4),
       (11, 'November', 30, 4),
       (12, 'December', 31, 1),
       (13, 'Month1', 31, 5),
       (14, 'Month2', 31, 0);