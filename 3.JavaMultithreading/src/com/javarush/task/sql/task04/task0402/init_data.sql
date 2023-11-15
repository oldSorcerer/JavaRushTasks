DROP TABLE IF EXISTS math;

CREATE TABLE math
(
    `a` DOUBLE not null,
    `b` DOUBLE not null
);

insert into `math` (a, b)
values (11, 22),
       (10, 3),
       (17, 2),
       (24, 9),
       (5.5, 3.2),
       (16, 7),
       (19, 22),
       (13.7, 29.1),
       (101.1, 55),
       (37, 13.3),
       (132, 33),
       (1.8, 20.5),
       (7, 55)
;