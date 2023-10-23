DROP TABLE IF EXISTS 'authors';
DROP TABLE IF EXISTS 'books';

CREATE TABLE `authors`
(
    `author_id`  INT          not null,
    `first_name` VARCHAR(100) not null,
    `last_name`  VARCHAR(100) not null,
    `sex`        VARCHAR(20)  not null,
    `year_born`  INT          not null,
    `country`    VARCHAR(100) not null
);

CREATE TABLE `books`
(
    `book_id`              INT          not null,
    `author_id`            INT null,
    `title`                VARCHAR(255) not null,
    `genre`                VARCHAR(100) not null,
    `date_released`        INT          not null,
    `copies_sold_millions` INT          not null
);

insert into authors (author_id, first_name, last_name, sex, year_born, country)
values (1, 'Ernest', 'Demingway', 'male', 1899, 'USA'),
       (2, 'Hermann', 'Jesse', 'male', 1877, 'Germany'),
       (3, 'Alexander', 'Pushko', 'male', 1799, 'Russia'),
       (4, 'George', 'Borwell', 'male', 1903, 'UK'),
       (5, 'Roald', 'Dahli', 'male', 1926, 'UK'),
       (6, 'Joanne', 'Swimling', 'female', 1965, 'UK'),
       (7, 'Leo', 'Hudoy', 'male', 1828, 'Russia'),
       (8, 'Stephen', 'Knight', 'male', 1947, 'USA'),
       (9, 'William', 'Stearspeare', 'male', 1564, 'UK'),
       (10, 'Agatha', 'Bristie', 'female', 1890, 'UK'),
       (11, 'John', 'Dolkin', 'male', 1892, 'UK')
;

insert into books (book_id, author_id, title, genre, date_released, copies_sold_millions)
values (1000, 1, 'The Sun Also Rises', 'novel', 1926, 5),
       (1119, 1, 'The Old Man and the Sea', 'novel', 1951, 15),
       (2002, 2, 'Peter Camenzind', 'novel', 1904, 10),
       (2010, 2, 'Steppenwolf', 'novel', 1927, 20),
       (3852, 3, 'Evgeny Onegin', 'poem', 1833, 19),
       (3333, 3, 'Ruslan and Ludmila', 'poem', 1820, 32),
       (4005, 4, 'Animal Farm', 'novel', 1945, 12),
       (4111, 4, '1984', 'novel', 1949, 55),
       (5123, 5, 'Charlie and the Chocolate Factory', 'story', 1964, 17),
       (5432, 5, 'The BFG', 'story', 1982, 49),
       (6006, 6, 'Harry Potter', 'fantasy', 1997, 555),
       (6987, 6, 'The Casual Vacancy', 'novel', 2012, 3),
       (7006, 7, 'War and Peace', 'novel', 1865, 97),
       (7123, 7, 'Anna Karenina', 'novel', 1875, 77),
       (8001, 8, 'The Stand', 'fiction', 1990, 9),
       (8011, 8, 'It', 'novel', 1986, 22),
       (9023, 9, 'Hamlet', 'play', 1600, 11),
       (9055, 9, 'Romeo and Juliet', 'tragedy', 1591, 203),
       (1009, 10, 'Murder on the Orient Express', 'mystery', 1934, 51),
       (1035, 10, 'And Then There Were None', 'novel', 1939, 99),
       (2002, 11, 'The Lord of the Rings', 'fantasy', 1954, 155),
       (2011, 11, 'The Hobbit', 'fantasy', 1937, 101),
       (1111, null, 'The Bible', 'religion', 1454, 9000)
;