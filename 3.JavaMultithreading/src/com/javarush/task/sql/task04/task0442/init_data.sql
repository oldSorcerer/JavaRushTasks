DROP TABLE IF EXISTS task;

CREATE TABLE task
(
       `id`            INT             not null    auto_increment primary key,
       `title`         VARCHAR(100)    not null,
       `exp_date`      DATE            not null
);

insert into task (id, title, exp_date)
values (1, 'Develop a feature', '2023-10-02'),
       (2, 'Improve speed', '2022-10-10'),
       (3, 'Update firewall', '2022-09-05'),
       (4, 'Develop a feature', '2022-09-11'),
       (5, 'Update firewall', '2022-09-23'),
       (6, 'Improve speed', '2022-10-25'),
       (7, 'Fix template', '2022-09-04'),
       (8, 'Update firewall', '2022-10-11'),
       (9, 'Improve speed', '2022-09-17'),
       (10, 'Fix template', '2023-09-20'),
       (11, 'Fix template', '2023-09-01'),
       (12, 'Improve speed', '2022-11-05'),
       (13, 'Fix template', '2022-10-09'),
       (14, 'Develop a feature', '2022-09-21'),
       (15, 'Improve speed', '2022-09-30'),
       (16,'Update firewall', '2022-09-01'),
       (17, 'Fix template', '2022-11-28'),
       (18, 'Fix template', '2022-09-21'),
       (19, 'Develop a feature', '2022-09-23'),
       (20, 'Fix template', '2022-10-19'),
       (21, 'Update firewall', '2022-12-12')
;

