DROP TABLE IF EXISTS cars;

CREATE TABLE cars
(
    `id`        INT          not null auto_increment primary key,
    `name`      VARCHAR(100) not null,
    `prod_year` DATE         not null,
    `price`     INT          not null
);

insert into cars (id, name, prod_year, price)
values (1, 'White Car', '2020-03-19', 45000),
       (2, 'Black Car', '2020-01-25', 35000),
       (3, 'Grey Car', '2021-11-20', 25000),
       (4, 'Blue Car', '2021-04-10', 100000),
       (5, 'Red Car', '2012-12-12', 10000),
       (6, 'White Car', '2022-02-20', 115000),
       (7, 'Blue Car', '2015-03-04', 19000),
       (8, 'Yellow Car', '2020-05-15', 35000),
       (9, 'Grey Car', '2021-10-11', 45000),
       (10, 'Blue Car', '2020-08-22', 45000),
       (11, 'Red Car', '2022-07-14', 65000),
       (12, 'Blue Car', '2022-09-19', 85000),
       (13, 'Green Car', '1999-03-26', 6000),
       (14, 'Yellow Car', '2021-01-29', 95000),
       (15, 'Red Car', '2020-08-01', 50000),
       (16, 'Green Car', '2022-11-27', 55000),
       (17, 'Blue Car', '2011-06-24', 20000),
       (18, 'Yellow Car', '2012-04-02', 80000),
       (19, 'Blue Car', '2018-07-12', 39000),
       (20, 'White Car', '2002-12-24', 15000);