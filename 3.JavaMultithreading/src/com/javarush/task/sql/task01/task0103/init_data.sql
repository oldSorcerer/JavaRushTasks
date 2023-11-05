DROP TABLE IF EXISTS brand;

CREATE TABLE brand
(
    `id`          INT          not null auto_increment primary key,
    `brand_name`  VARCHAR(100) not null,
    `brand_logo`  VARCHAR(100) not null,
    `create_year` INT          not null
);

insert into brand (id, brand_name, brand_logo, create_year)
values (1, 'gussi', 'GI', 1850),
       (2, 'kwik e mart', 'KM', 1990),
       (3, 'dunkin chickens', 'DC', 1817),
       (4, 'thai tanic', 'TT', 1999),
       (5, 'bread pitt', 'BP', 1989)
;