DROP TABLE IF EXISTS 'math';

CREATE TABLE `math`
(
    `a` DOUBLE not null,
    `b` DOUBLE not null
);

insert into `math` (a, b)
values (11.11, 22.2),
       (10.5, 3.0),
       (17.45, 2.01),
       (24.543, 9.99),
       (5.51, 3.21),
       (16.1, 7.09),
       (19.999, 22.123),
       (13.7, 29.15),
       (101.1, 55.76),
       (37.97, 13.36),
       (132.341, 33.876),
       (1.862, 20.52),
       (7.34, 51.27)
;