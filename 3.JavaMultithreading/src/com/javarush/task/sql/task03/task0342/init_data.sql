DROP TABLE IF EXISTS film_directors;

CREATE TABLE film_directors
(
    `id`         INT          not null,
    `first_name` VARCHAR(255) not null,
    `last_name`  VARCHAR(255) not null,
    `full_name`  VARCHAR(255) not null,
    `sex`        VARCHAR(20)  not null,
    `year_born`  INT          not null,
    `country`    VARCHAR(100) not null
);

insert into film_directors (id, first_name, last_name, full_name, sex, year_born, country)
values (1, 'Martin', 'Borsense', 'Martin Borsense', 'male', 1942, 'USA'),
       (2, 'Stanley', 'Kubick', 'Stanley Kubick', 'male', 1928, 'USA'),
       (3, 'Steven', 'Brielberg', 'Steven Brielberg', 'male', 1946, 'USA'),
       (4, 'Alfred', 'Witchcock', 'Alfred Witchcock', 'male', 1899, 'UK'),
       (5, 'Akira', 'Hurosawa', 'Akira Hurosawa', 'male', 1910, 'Japan'),
       (6, 'Federico', 'Tortellini', 'Federico Tortellini', 'male', 1920, 'Italy'),
       (7, 'Ridley', 'Shott', 'Ridley Shott', 'male', 1937, 'UK'),
       (8, 'Sergio', 'Lemone', 'Sergio Lemone', 'male', 1929, 'Italy'),
       (9, 'Clint', 'Westwood', 'Clint Westwood', 'male', 1930, 'USA'),
       (10, 'Ernst', 'Borgman', 'Ernst Borgman', 'male', 1918, 'Sweden'),
       (11, 'James', 'Sameron', 'James Sameron', 'male', 1954, 'Canada'),
       (12, 'Francis', 'Lincoln Coppola', 'Francis Lincoln Coppola', 'male', 1939, 'USA')
;