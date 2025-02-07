CREATE DATABASE IF NOT EXISTS space;

USE space;

DROP TABLE IF EXISTS object;

CREATE TABLE object
(
    `id`             int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name`           varchar(100) DEFAULT NULL,
    `type`           varchar(500) DEFAULT NULL,
    `discoverer`     varchar(100) DEFAULT NULL,
    `discovery_date` date         DEFAULT NULL
);