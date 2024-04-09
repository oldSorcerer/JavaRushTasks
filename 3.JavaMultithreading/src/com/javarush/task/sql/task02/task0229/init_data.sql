DROP TABLE IF EXISTS cars;

CREATE TABLE cars
(
    `id`        INT          not null auto_increment primary key,
    `name`      VARCHAR(100) not null,
    `prod_year` INT          not null,
    `price`     INT          not null
);

insert into cars (id, name, prod_year, price)
values (1, 'White Car', 2020, 45000),
       (2, 'Black Car', 2020, 35000),
       (3, 'Grey Car', 2021, 25000),
       (4, 'Blue Car', 2021, 100000),
       (5, 'Red Car', 2012, 10000),
       (6, 'White Car', 2022, 115000),
       (7, 'Blue Car', 2015, 19000),
       (8, 'Yellow Car', 2020, 35000),
       (9, 'Grey Car', 2021, 45000),
       (10, 'Blue Car', 2020, 45000),
       (11, 'Red Car', 2022, 65000),
       (12, 'Blue Car', 2022, 85000),
       (13, 'Green Car', 1999, 6000),
       (14, 'Yellow Car', 2021, 95000),
       (15, 'Red Car', 2020, 50000),
       (16, 'Green Car', 2022, 55000),
       (17, 'Blue Car', 2011, 20000),
       (18, 'Yellow Car', 2012, 80000),
       (19, 'Blue Car', 2018, 39000),
       (20, 'White Car', 2002, 15000)
;
