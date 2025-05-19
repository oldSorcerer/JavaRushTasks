DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`            INT          not null auto_increment,
    `name`          VARCHAR(100) not null,
    `name_b64`      VARCHAR(100) not null,
    PRIMARY KEY (id)
);

insert into employee (id, name, name_b64)
values (1, 'Tom', 'VG9t'),
       (2, 'Jim', 'Smlt'),
       (3, 'Daniel', 'RGFuaWVs'),
       (4, 'Amy', 'QW15'),
       (5, 'Lee', 'TGVl'),
       (6, 'Maria', 'TWFyaWE='),
       (7, 'Julia', 'SnVsaWE='),
       (8, 'Kim', 'S2lt'),
       (9, 'Andy', 'QW5keQ=='),
       (10, 'Marcus', 'TWFyY3Vz'),
       (11, 'Bill', 'QmlsbA=='),
       (12, 'Oscar', 'T3NjYXI='),
       (13, 'Alex', 'QWxleA=='),
       (14, 'Mohamed', 'TW9oYW1lZA=='),
       (15, 'Luka', 'THVrYQ=='),
       (16, 'Earl', 'RWFybA=='),
       (17, 'Albert', 'QWxiZXJ0'),
       (18, 'Robert', 'Um9iZXJ0'),
       (19, 'Joe', 'Sm9l'),
       (20, 'Timothy', 'VGltb3RoeQ=='),
       (21, 'Nicholas', 'TmljaG9sYXM=')
;