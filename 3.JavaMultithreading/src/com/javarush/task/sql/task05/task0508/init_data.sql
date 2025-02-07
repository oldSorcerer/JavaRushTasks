CREATE DATABASE IF NOT EXISTS library;

USE library;

DROP TABLE IF EXISTS author;

CREATE TABLE author
(
    `id`         int NOT NULL AUTO_INCREMENT AUTO_INCREMENT PRIMARY KEY,,
    `first_name` varchar(50)  DEFAULT NULL,
    `last_name`  varchar(50)  DEFAULT NULL,
    `full_name`  varchar(100) DEFAULT NULL
);

INSERT INTO author
VALUES (1, 'Robert', 'Stevenson', 'Robert Louis Stevenson'),
       (2, 'Aldous', 'Huxley', 'Aldous Leonard Huxley'),
       (3, 'Gabriel', 'Marquez', 'Gabriel Garcia Marquez'),
       (4, 'Ernest', 'Hemingway', 'Ernest Hemingway'),
       (5, 'William', 'Shakespeare', 'William Shakespeare'),
       (6, 'Homer', NULL, 'Homer'),
       (7, 'Mark', 'Twain', 'Mark Twain'),
       (8, 'George', 'Orwell', 'George Orwell'),
       (9, 'Plato', NULL, 'Plato'),
       (10, 'Edgar', 'Poe', 'Edgar Allan Poe'),
       (11, 'John', 'Tolkien', 'John Ronald Reuel Tolkien'),
       (12, 'Franz', 'Kafka', 'Franz Kafka'),
       (13, 'Arthur', 'Doyle', 'Arthur Conan Doyle'),
       (14, 'Charles', 'Dickens', 'Charles Dickens'),
       (15, 'James', 'Joyce', 'James Joyce'),
       (16, 'Jules', 'Verne', 'Jules Verne'),
       (17, 'Johann', 'Goethe', 'Johann Wolfgang von Goethe'),
       (18, 'Marcel', 'Proust', 'Marcel Proust'),
       (19, 'Friedrich', 'Nietzsche', 'Friedrich Wilhelm Nietzsche'),
       (20, 'Joanne', 'Rowling', 'J. K. Rowling'),
       (21, 'Stephen', 'King', 'Stephen Edwin King'),
       (22, 'Clive', 'Lewis', 'Clive Staples Lewis'),
       (23, 'Hajime', 'Isayama', 'Hajime Isayama'),
       (24, 'Edgar', 'Burroughs', 'Edgar Rice Burroughs'),
       (25, 'Lewis', 'Carroll', 'Lewis Carroll'),
       (26, 'Astrid', 'Lindgren', 'Astrid Lindgren'),
       (27, 'Richard', 'Scarry', 'Richard Scarry');

