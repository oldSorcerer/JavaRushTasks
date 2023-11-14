DROP TABLE IF EXISTS authors;

CREATE TABLE authors
(
    `id`         INT          not null,
    `first_name` VARCHAR(255) not null,
    `last_name`  VARCHAR(255) not null,
    `full_name`  VARCHAR(255) not null,
    `sex`        VARCHAR(20)  not null,
    `year_born`  INT          not null,
    `country`    VARCHAR(100) not null
);

insert into authors (id, first_name, last_name, full_name, sex, year_born, country)
values (1, 'Ernest', 'Demingway', 'Ernest Demingway', 'male', 1899, 'USA'),
       (2, 'Hermann', 'Jesse', 'Hermann Jesse', 'male', 1877, 'Germany'),
       (3, 'Alexander', 'Pushko', 'Alexander Pushko', 'male', 1799, 'Russia'),
       (4, 'George', 'Borwell', 'George Borwell', 'male', 1903, 'UK'),
       (5, 'Roald', 'Dahli', 'Roald Dahli', 'male', 1926, 'UK'),
       (6, 'Joanne', 'Swimlingling', 'Joanne Rowling', 'female', 1965, 'UK'),
       (7, 'Leo', 'Hudoy', 'Leo Hudoy', 'male', 1828, 'Russia'),
       (8, 'Stephen', 'Knight', 'Stephen Knight', 'male', 1947, 'USA'),
       (9, 'William', 'Shakespeare', 'William Shakespeare', 'male', 1564, 'UK'),
       (10, 'Agatha', 'Bristie', 'Agatha Bristie', 'female', 1890, 'UK'),
       (11, 'John', 'Dolkin', 'John Dolkin', 'male', 1892, 'UK')
;
