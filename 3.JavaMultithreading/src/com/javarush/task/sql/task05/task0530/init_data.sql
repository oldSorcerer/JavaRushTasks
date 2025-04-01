CREATE DATABASE IF NOT EXISTS space;

USE space;

DROP TABLE IF EXISTS object;

CREATE TABLE object
(
    `id`             int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    `name`           varchar(100) DEFAULT NULL,
    `type`           varchar(500) DEFAULT NULL,
    `discoverer`     varchar(100) DEFAULT NULL,
    `discovery_date` date         DEFAULT NULL
);

INSERT INTO object
VALUES (1, 'Uranus', 'PLANET', 'William Herschel', '1781-03-13'),
       (2, 'Phobos', 'SATELLITE', 'Asaph Hall', '1877-08-18'),
       (3, 'Deimos', 'SATELLITE', 'Asaph Hall', '1877-08-12'),
       (4, '4446 Carolyn', 'ASTEROID', 'E. Bowell', '1985-10-15'),
       (5, 'Titan', 'SATELLITE', 'Christiaan Huygens', '1655-03-25'),
       (6, 'Pluto', 'DWARF_PLANET', 'Clyde W. Tombaugh', '1930-02-18'),
       (7, 'P/2010 B2', 'COMET', 'WISE', '2010-01-22'),
       (8, 'C/1823 Y1', 'COMET', 'Nell de Breaute', '1823-12-29'),
       (9, 'Sun', 'STAR', NULL, NULL),
       (10, 'Vesta', 'ASTEROID', 'Heinrich Wilhelm Olbers', '1807-03-29'),
       (11, 'Io', 'SATELLITE', 'Galileo Galilei', '1610-01-08'),
       (12, 'Callisto', 'SATELLITE', 'Galileo Galilei', '1610-01-07'),
       (13, '1143 Odysseus', 'ASTEROID', 'K. Reinmuth', '1930-01-28'),
       (14, '624 Hektor', 'ASTEROID', 'A. Kopff', '1907-02-10'),
       (15, '588 Achilles', 'ASTEROID', 'M. F. Wolf', '1906-02-22'),
       (16, 'Venus', 'PLANET', NULL, NULL),
       (17, 'Mars', 'PLANET', NULL, NULL),
       (18, '2016 BA14', 'COMET', 'Pan-STARRS', '2016-01-22'),
       (19, '2019 LD2', 'COMET', 'ATLAS-MLO', '2019-06-10'),
       (20, 'C/1858 L1', 'COMET', 'Giovanni Battista Donati', '1858-06-02'),
       (21, '2020 XL5', 'ASTEROID', 'Pan-STARRS 1', '2020-12-12'),
       (22, 'Moon', 'SATELLITE', NULL, NULL),
       (23, 'Jupiter', 'PLANET', NULL, NULL),
       (24, 'C/1910 A1', 'COMET', 'Robert T. A. Innes', '1910-01-17');
