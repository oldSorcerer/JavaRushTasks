DROP TABLE IF EXISTS films;

CREATE TABLE films
(
    `film_id`       INT          not null,
    `director_id`   INT null,
    `title`         VARCHAR(255) not null,
    `genre`         VARCHAR(100) not null,
    `year_released` INT          not null,
    `grossed`       INT          not null
);

insert into films (film_id, director_id, title, genre, year_released, grossed)
values (1000, 1, 'Movie 1', 'comedy', 2013, 400),
       (1001, 1, 'Movie 2', 'crime', 1990, 100),
       (2000, 2, 'Movie 3', 'sci-fi', 1968, 200),
       (2001, 2, 'A Movie 4', 'crime', 1971, 115),
       (3000, 3, 'Saving Movie 5', 'war', 1998, 500),
       (3001, 3, 'Movie 6', 'historical', 1993, 350),
       (4000, 4, 'Movie 7', 'horror', 1960, 35),
       (4001, 4, 'The Movie 8', 'horror', 1963, 15),
       (5000, 5, 'The Movie 9', 'drama', 1951, 14),
       (5001, 5, 'Movie 10', 'action', 1961, 3),
       (6000, 6, 'La Dolce Movie 11', 'drama', 1960, 20),
       (6001, 6, 'La Movie 12', 'drama', 1954, 10),
       (7000, 7, 'Movie 13', 'sc-fi', 1979, 250),
       (7001, 7, 'Movie 14', 'novel', 1875, 500),
       (8000, 8, 'Gran Movie 15', 'drama', 2008, 270),
       (8001, 8, 'Dirty Movie 16', 'action', 1971, 40),
       (9000, 9, 'Once Upon a Time in the Movie 17', 'western', 1968, 10),
       (9001, 9, 'The Good, the Bad and the Movie 18', 'western', 1966, 40),
       (1010, 10, 'The Seventh Movie 19', 'fantasy', 1957, 50),
       (1011, 10, 'Wild Movie 20', 'drama', 1957, 22),
       (2010, 11, 'The Terminator', 'sci-fi', 1984, 80),
       (2011, 11, 'Movie 22', 'drama', 1997, 2200),
       (3010, 12, 'Apocalypse Movie 23', 'war', 1979, 150),
       (3011, 12, 'The Movie 24', 'crime', 1972, 300)
;