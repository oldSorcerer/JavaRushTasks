DROP TABLE IF EXISTS gyms;
DROP TABLE IF EXISTS customers;

CREATE TABLE gyms
(
    `id`       INT          not null auto_increment primary key ,
    `name`     VARCHAR(100) not null,
    `location` VARCHAR(100) not null
);

CREATE TABLE customers
(
    `id`        INT          not null auto_increment primary key ,
    `name`      VARCHAR(100) not null,
    `sex`       VARCHAR(100) not null,
    `email`     VARCHAR(200) not null,
    `telephone` INT null
);

insert into gyms (id, name, location)
values (100, 'Gym A', 'Oslo'),
       (111, 'Gym X', 'Berlin'),
       (222, 'Gym C', 'London'),
       (123, 'Gym B', 'Miami'),
       (999, 'Gym O', 'Tokyo'),
       (321, 'Gym T', 'Perth')
;

insert into customers (id, name, sex, email, telephone)
values (10, 'Jack', 'male', 'jackemail@gmail.com', 442345678),
       (22, 'Mary', 'female', 'maryemail@yahoo.com', 469999999),
       (13, 'Bob', 'male', 'bobemail@proton.me', 1234567890),
       (44, 'Mohammad', 'male', 'moemail@mail.com', 223456789),
       (77, 'Karen', 'female', 'karenemail@protonmail.com', 375234567),
       (58, 'Peter', 'male', 'peteremail@qq.com', 173569219),
       (29, 'Alice', 'female', 'aliceemail@gmail.com', 448262548),
       (14, 'Tony', 'male', 'tony@email.com', 439715384),
       (45, 'Hulk', 'male', 'hulk@hulk.com', 111111111),
       (66, 'Jane', 'female', 'janeemail@awsd.com', 1987654321),
       (99, 'Adam', 'male', 'adamemail@qwerty.com', 888888888),
       (111, 'Arnold', 'male', 'arnold@iron.com', 555555555);