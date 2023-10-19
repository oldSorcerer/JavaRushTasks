DROP TABLE IF EXISTS 'users';

CREATE TABLE users
(
    `id`        INT          not null auto_increment,
    `name`      VARCHAR(100) not null,
    `last_name` VARCHAR(100) not null,
    `age`       INT          not null
);

insert into users (id, name, last_name, age)
values (1, 'Jack', 'Sparrow', 30),
       (4, 'Mary', 'Johnson', 25),
       (6, 'Jeffrey', 'Lebowski', 45),
       (2, 'James', 'Bond', 33),
       (7, 'Hannah', 'Montana', 25)
       (8, 'Vito', 'Corleone', 65)
       (10, 'Bob', 'Smith', 25)
       (9, 'Arnold', 'Schwarzenegger', 40)
;