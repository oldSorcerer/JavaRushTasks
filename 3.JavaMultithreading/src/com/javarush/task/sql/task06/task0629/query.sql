CREATE TABLE `event`
(
    `id`        INT         not null    auto_increment,
    `date`      DATE        not null,
    `user_id`   INT         not null,
    `type`      VARCHAR(20) not null,
    `status`    VARCHAR(10) not null,
    PRIMARY KEY(id),
    -- Write your code here:

);

insert into event (id, date, user_id, type, status)
values (1, '2022-10-01', 1, 'REGISTRATION', 'OK');