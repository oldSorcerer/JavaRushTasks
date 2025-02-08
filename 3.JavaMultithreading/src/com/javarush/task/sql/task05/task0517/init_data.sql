CREATE DATABASE IF NOT EXISTS lego;

USE lego;

DROP TABLE IF EXISTS lego_set;

CREATE TABLE `lego_set`
(
    `id`        int(11)      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `number`    int(11)      NOT NULL,
    `name`      varchar(100) NOT NULL,
    `released`  int(11)      NOT NULL,
    `inventory` int(11)      NOT NULL
);

INSERT INTO lego_set
VALUES (1, 42110, 'Land Rover Defender', 2019, 2573),
       (2, 75192, 'Millennium Falcon', 2017, 7541),
       (3, 70676, 'Lloyd\'s Titan Mech', 2019, 878),
       (4, 21042, 'Statue of Liberty', 2018, 1685),
       (5, 41491, 'Batman & The Joker', 2016, 206),
       (6, 60198, 'Cargo Train', 2018, 1226),
       (7, 71043, 'Hogwarts Castle', 2018, 6020),
       (8, 11008, 'Bricks and Houses', 2020, 270),
       (9, 10266, 'NASA Apollo 11 Lunar Lander', 2019, 1087),
       (10, 43185, 'Boun’s Boat', 2021, 247),
       (11, 41150, 'Moana\'s Ocean Voyage', 2016, 307),
       (12, 41379, 'Heartlake City Restaurant', 2019, 640),
       (13, 76989, 'Horizon Forbidden West: Tallneck', 2022, 1222),
       (14, 75936, 'Jurassic Park: T. rex Rampage', 2019, 3120),
       (15, 21108, 'Ghostbusters Ecto-1', 2014, 508),
       (16, 21155, 'The Creeper Mine', 2019, 834),
       (17, 10211, 'Grand Emporium', 2010, 2187),
       (18, 80009, 'Pigsy\'s Food Truck', 2020, 832),
       (19, 75888, 'Porsche 911 RSR and 911 Turbo 3.0', 2018, 398),
       (20, 76139, '1989 Batmobile', 2019, 3310),
       (21, 76218, 'Sanctum Sanctorum', 2022, 2713);