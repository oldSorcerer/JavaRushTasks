DROP TABLE IF EXISTS owner;

CREATE TABLE owner
(
    `id`         INT          not null auto_increment primary key,
    `first_name` VARCHAR(100) not null,
    `last_name`  VARCHAR(100) not null,
    `nick_name`  VARCHAR(100) not null
);

insert into owner (id, first_name, last_name, nick_name)
values (5, 'Jack', 'Sparrow', 'pirate'),
       (11, 'Jeffrey', 'Lebowski', 'dude'),
       (7, 'James', 'Bond', 'agent'),
       (1, 'Vito', 'Corleone', 'godfather')
       (100, 'Arnold', 'Schwarzenegger', 'terminator')
       (1, 'Hannibal', 'Lecter', 'cannibal')
;