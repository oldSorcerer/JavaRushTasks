CREATE DATABASE IF NOT EXISTS lego;

USE lego;

DROP TABLE IF EXISTS lego_set;

CREATE TABLE lego_set
(
    `id`        int(11)      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `number`    int(11)      NOT NULL,
    `name`      varchar(100) NOT NULL,
    `released`  int(11)      NOT NULL,
    `inventory` int(11)      NOT NULL
);