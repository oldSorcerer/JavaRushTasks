CREATE DATABASE IF NOT EXISTS library;

USE library;

DROP TABLE IF EXISTS author;

CREATE TABLE author
(
    `id`         int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `first_name` varchar(50)  DEFAULT NULL,
    `last_name`  varchar(50)  DEFAULT NULL,
    `full_name`  varchar(100) DEFAULT NULL
);