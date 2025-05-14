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

DROP TABLE IF EXISTS book;

CREATE TABLE book
(
    `id`               int NOT NULL AUTO_INCREMENT,
    `title`            varchar(100) DEFAULT NULL,
    `author_id`        int          DEFAULT NULL,
    `publisher_id`     int          DEFAULT NULL,
    `publication_year` int          DEFAULT NULL,
    `isbn`             bigint       DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FK_BOOK_ON_AUTHOR` (`author_id`),
    KEY `FK_BOOK_ON_PUBLISHER` (`publisher_id`)
);

INSERT INTO book
VALUES (1, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2017, 9785389052857),
       (2, 'СТРАННАЯ ИСТОРИЯ ДОКТОРА ДЖЕКИЛА И МИСТЕРА ХАЙДА', 1, 1, 2019, 9785389024007),
       (3, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2017, 9785389092983),
       (4, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2007, 9785911815196),
       (5, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2011, 9785389031173),
       (6, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2015, 9785389097186),
       (7, 'ГАМЛЕТ', 5, 1, 2018, 9785389064751),
       (8, 'УКРОЩЕНИЕ СТРОПТИВОЙ', 5, 1, 2016, 9785389033900),
       (9, 'РОМЕО И ДЖУЛЬЕТТА', 5, 1, 2018, 9785389027039),
       (10, 'УКРОЩЕНИЕ СТРОПТИВОЙ', 5, 1, 2009, 9785998503160),
       (11, 'ОДИССЕЯ', 6, 1, 2018, 9785389057319),
       (12, 'ОДИССЕЯ', 6, 1, 2018, 9785389092983),
       (13, 'ИЛИАДА', 6, 1, 2018, 9785389058705),
       (14, 'ИЛИАДА', 6, 1, 2018, 9785389030800),
       (15, 'ОДИССЕЯ', 6, 1, 2014, 9785389081192),
       (16, 'ОДИССЕЯ', 6, 1, 2010, 9785998509018),
       (17, 'ИЛИАДА', 6, 1, 2014, 9785389078390),
       (18, 'ИЛИАДА', 6, 1, 2010, 9785389078390),
       (19, 'ЯНКИ ПРИ ДВОРЕ КОРОЛЯ АРТУРА', 7, 2, 2018, 9789660375383),
       (20, 'ПРИКЛЮЧЕНИЯ ТОМА СОЙЕРА', 7, 1, 2018, 9785389030978);

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
       (3, 'Авторское издание');