DROP TABLE IF EXISTS cars;

CREATE TABLE cars
(
    `id`        INT          not null auto_increment primary key,
    `name`      VARCHAR(100) not null,
    `prod_year` INT          not null,
    `euro`      INT          null,
    `price`     INT          not null
);

insert into cars (id, name, prod_year, euro, price)
values (1, 'New Red Car', 2021, 5, 95000),
       (2, 'Old Black Car', 2009, 3, 9000),
       (3, 'Old Blue Car', 2014, 4, 21000),
       (4, 'New White Car', 2022, null, 100000),
       (5, 'Super New Red Car', 2022, null, 150000),
       (6, 'Old Yellow Car', 1999, 2, 6000),
       (7, 'Old Green Car', 2012, 3, 10000),
       (8, 'New Grey Car', 2021, 5, 35000);
