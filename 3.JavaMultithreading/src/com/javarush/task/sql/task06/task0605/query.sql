create table users
(
    user_id    int          not null auto_increment,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    date       date         not null default GETDATE(),
    weight     float(10) null,
    primary key (user_id)
);