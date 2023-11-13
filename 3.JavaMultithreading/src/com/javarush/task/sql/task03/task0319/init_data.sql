DROP TABLE IF EXISTS top_retailers;
DROP TABLE IF EXISTS suppliers;

CREATE TABLE top_retailers
(
    `ret_rank`     INT          not null,
    `ret_name`     VARCHAR(100) not null,
    `ret_location` VARCHAR(100) not null,
    `ret_revenue`  INT          not null
);

CREATE TABLE suppliers
(
    `sup_rank`    INT          not null,
    `sup_name`    VARCHAR(100) not null,
    `sup_country` VARCHAR(100) not null,
    `sup_revenue` INT          not null
);

insert into top_retailers (ret_rank, ret_name, ret_location, ret_revenue)
values (1, 'Big-Mart', 'USA', 555),
       (2, 'Forrest.com', 'USA', 333),
       (3, 'Braun Group', 'Germany', 158),
       (4, 'Lidli', 'Germany', 134),
       (5, 'Costless', 'USA', 199),
       (6, 'Aholdon', 'Netherlands', 91),
       (7, 'Careful', 'France', 101),
       (8, 'OKAY', 'Sweden', 44),
       (9, 'Eleven & I', 'Japan', 87),
       (10, 'The Depot', 'USA', 152)
;

insert into suppliers (sup_rank, sup_name, sup_country, sup_revenue)
values (2, 'Applecrumble & Fish', 'USA', 100500),
       (13, 'Sappos', 'USA', 2),
       (1, 'Anker', 'China', 13),
       (7, 'Beanz', 'USA', 28),
       (3, 'Unigear', 'UK', 43),
       (12, 'Nest', 'Switzerland', 90),
       (10, 'Pepcola', 'USA', 21),
       (11, 'KMWO Co.', 'China', 9),
       (5, 'Always Cola', 'USA', 39),
       (6, 'Diagiagio', 'UK', 25),
       (9, 'Danonium', 'France', 35),
       (4, 'XYW InBev SA', 'Belgium', 55),
       (8, 'Random International', 'USA', 37)
;