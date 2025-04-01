CREATE DATABASE IF NOT EXISTS library;

USE library;

DROP TABLE IF EXISTS publisher;

CREATE TABLE publisher
(
    `id`   int NOT NULL PRIMARY KEY,
    `name` varchar(100) DEFAULT NULL
);

INSERT INTO publisher
VALUES (0, 'Фолио'),
       (1, 'Азбука'),
       (2, 'Фолио'),
       (3, 'Wordsworth Editions');