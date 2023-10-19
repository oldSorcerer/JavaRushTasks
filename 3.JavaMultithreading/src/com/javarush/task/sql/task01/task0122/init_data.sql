DROP TABLE IF EXISTS 'car';

CREATE TABLE `car`
(
    `id`              INT          not null auto_increment,
    `brand`           VARCHAR(100) not null,
    `model`           VARCHAR(100) not null,
    `quantity`        INT          not null,
    `booked_quantity` INT          not null
);

insert into car (id, brand, model, quantity, booked_quantity)
values (1, 'lada', '2107', 99999, 0),
       (2, 'mazda', '6', 100, 50),
       (3, 'toyota', 'camry', 45, 45),
       (4, 'vw', 'golf', 10000, 999),
       (5, 'nissan', 'leaf', 50, 11),
       (6, 'peugeot', '208', 119, 49),
       (7, 'renault', 'megan', 851, 112),
       (8, 'opel', 'mokka', 87, 83),
       (9, 'mazda', 'cx-30', 0, 0),
       (10, 'uaz', 'patriot', 5555, 55),
       (11, 'moskvitch', '3', 100, 1),
       (12, 'seat', 'leon', 0, 0),
       (13, 'ferrari', 'monza', 5, 5),
       (14, 'suzuki', 'swift', 456, 123),
       (15, 'skoda', 'karoq', 54, 48),
       (16, 'volvo', 'xc90', 10, 7),
       (17, 'toyota', 'rav4', 20000, 11999)
;