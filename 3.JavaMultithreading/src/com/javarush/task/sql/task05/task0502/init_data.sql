CREATE DATABASE IF NOT EXISTS lego;

USE lego;

DROP TABLE IF EXISTS part;

CREATE TABLE part
(
    `id`     int(11)      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `number` varchar(25)  NOT NULL,
    `name`   varchar(100) NOT NULL,
    `weight` float        NOT NULL
);