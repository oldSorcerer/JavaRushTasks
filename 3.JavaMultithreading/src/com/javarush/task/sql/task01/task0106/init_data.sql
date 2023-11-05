DROP TABLE IF EXISTS user_name;

CREATE TABLE user_name
(
    `id`         INT          not null auto_increment primary key,
    `first_name` VARCHAR(100) not null,
    `last_name`  VARCHAR(100) not null,
    `nick_name`  VARCHAR(100) not null
);

insert into user_name (id, first_name, last_name, nick_name)
values (4, 'Jack', 'Sparrow', 'pirate'),
       (7, 'Jeffrey', 'Lebowski', 'dude'),
       (11, 'James', 'Bond', 'agent'),
       (15, 'Michael', 'Corleone', 'godfather')
;