DROP TABLE IF EXISTS cars;

CREATE TABLE cars
(
    `id`        INT          not null auto_increment primary key,
    `name`      VARCHAR(100) not null,
    `prod_date` DATE         not null,
    `price`     INT          not null
);

insert into cars (id, name, prod_date, price)
values (1, 'White Car', '2020-03-19', 45000),
       (2, 'Black Car', '2020-01-25', 150000),
       (3, 'Grey Car', '2021-11-20', 25000),
       (4, 'Blue Car', '2021-04-10', 250000),
       (5, 'Red Car', '2012-12-12', 10000),
       (6, 'White Car', '2020-02-20', 201000),
       (7, 'Blue Car', '2020-03-04', 19000),
       (8, 'Yellow Car', '2021-05-15', 35000),
       (9, 'Grey Car', '2021-10-11', 45000),
       (10, 'Blue Car', '2020-08-22', 45000),
       (11, 'Red Car', '2000-07-14', 65000),
       (12, 'Blue Car', '2015-09-19', 100000),
       (13, 'Green Car', '2022-03-26', 6000),
       (14, 'Yellow Car', '2019-01-29', 95000),
       (15, 'Red Car', '2020-08-01', 50000),
       (16, 'Green Car', '2021-11-27', 55000),
       (17, 'Blue Car', '2011-06-24', 20000),
       (18, 'Yellow Car', '2015-04-02', 300000),
       (19, 'Blue Car', '2018-07-12', 39000),
       (20, 'White Car', '2002-12-24', 15000);