DROP TABLE IF EXISTS 'brand';

CREATE TABLE `brand`
(
    `id`          INT          not null auto_increment,
    `brand_name`  VARCHAR(100) not null,
    `brand_logo`  VARCHAR(100) not null,
    `create_year` INT          not null
);

insert into brand (id, brand_name, brand_logo, create_year)
values (1, 'Dave', 'DE', 1950),
       (2, 'Burger Queen', 'BQ', 1960),
       (3, 'Louis Bidon', 'LB', 1899),
       (4, 'Barberryska', 'BA', 1957)
;