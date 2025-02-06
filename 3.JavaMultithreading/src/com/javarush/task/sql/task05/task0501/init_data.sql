CREATE DATABASE IF NOT EXISTS library;

USE library;

DROP TABLE IF EXISTS publisher;

CREATE TABLE publisher
(
    `id`   int NOT NULL PRIMARY KEY,
    `name` varchar(100) DEFAULT NULL
);