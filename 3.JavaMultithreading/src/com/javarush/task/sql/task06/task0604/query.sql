create table users
(
    user_id    int not null auto_increment,
    first_name varchar(255)    not null,
    last_name  varchar(255)    not null,
    primary key (user_id)
);