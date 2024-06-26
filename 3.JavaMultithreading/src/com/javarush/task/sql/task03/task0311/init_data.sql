DROP TABLE IF EXISTS top_retailers;
DROP TABLE IF EXISTS suppliers;

CREATE TABLE top_retailers
(
    `rank`                    INT          not null,
    `name`                    VARCHAR(100) not null,
    `hq_location`             VARCHAR(100) not null,
    `annual_revenue_billions` VARCHAR(20) null
);

CREATE TABLE suppliers
(
    `rank`                    INT          not null,
    `name`                    VARCHAR(100) not null,
    `country`                 VARCHAR(100) not null,
    `website`                 VARCHAR(200) not null,
    `annual_revenue_billions` VARCHAR(20) null
);

insert into top_retailers (`rank`, name, hq_location, annual_revenue_billions)
values (1, 'Big-Mart', 'USA', '$555'),
       (2, 'Forrest.com', 'USA', '$333'),
       (3, 'Braun Group', 'Germany', '$158'),
       (4, 'Lidli', 'Germany', '$134'),
       (5, 'Costless', 'USA', '$199'),
       (6, 'Aholdon', 'Netherlands', '$91'),
       (7, 'Careful', 'France', '$101'),
       (8, 'OKAY', 'Sweden', '$44'),
       (9, 'Eleven & I', 'Japan', '$87'),
       (10, 'The Depot', 'USA', '$152')
;

insert into suppliers (`rank`, name, country, website, annual_revenue_billions)
values (2, 'Applecrumble & Fish', 'USA', 'af.com', '$100500'),
       (13, 'Sappos', 'USA', 'sappos.com', '$2'),
       (1, 'Anker', 'China', 'anker.com', '$13'),
       (7, 'Beanz', 'USA', 'beanz.com', '$28'),
       (3, 'Unigear', 'UK', 'unigear.com', '$43'),
       (12, 'Nest', 'Switzerland', 'nest.com', '$90'),
       (10, 'Pepcola', 'USA', 'pepcola.com', '$21'),
       (11, 'KMWO Co.', 'China', 'kmwo.com', '$9'),
       (5, 'Always Cola', 'USA', 'cola.com', '$39'),
       (6, 'Diagiagio', 'UK', 'diagiagio.com', '$25'),
       (9, 'Danonium', 'France', 'danonium.com', '$35'),
       (4, 'XYW InBev SA', 'Belgium', 'zyw.com', '$55'),
       (8, 'Random International', 'USA', 'random.com', '$37');