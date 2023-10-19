DROP TABLE IF EXISTS 'parts';

CREATE TABLE `parts`
(
       `id`          INT         not null auto_increment,
       `identifier`  VARCHAR(50) not null,
       `description` VARCHAR(50) null,
       `required`    BOOLEAN     not null
);

insert into parts (id, identifier, description, required)
values (1, '1f76bc86-f76b-44fc-983b-8f3b620332ee', 'wheel', true),
       (2, '3174d661-1050-4cb8-8ff7-a2921ebfbf10', 'filter', false),
       (3, '93bf4072-08fa-439e-bc64-9569d84e2b60', 'turbo', false),
       (4, '481d2503-03cb-404e-841e-790e19523ce2', 'nitro', true),
       (5, '08a4ce4d-c81f-4145-9ac7-c07c2a4365d5', 'box', true),
       (6, '1e481155-2414-481e-854c-cf0a89de89f8', 'air intake', true),
       (7, '0cf1a480-11db-4615-b656-33643284a294', 'exhaust', false),
       (8, '74aee1ed-890f-4cdd-9bf9-4b02a6bd300d', null, false),
       (9, 'a3be3a8e-0338-4939-8d3d-b5a06b332ebd', 'damper', false),
       (10, 'f1f862e8-d7ba-415f-ba27-b8feb7cbf425', 'cooling', true),
       (11, 'ff6d8e58-357a-4123-9256-6f575dc7fced', 'matrix headlight', false),
       (12, '0f95111e-48cc-41bb-8ec2-f6dbeebc8396', 'spoiler', false),
       (13, 'be32248e-688d-4c78-9584-a8a8860e232e', 'camera', false),
       (14, '0ab5aaf0-b0d9-43d2-9883-f8b4dc86f697', 'speaker', false),
       (15, '6a97cb76-b1ba-42db-b900-7af1b59caa94', 'spare wheel', false),
       (16, 'f48aea34-f849-4375-b02c-f3187b5ed702', 'manual', true),
       (17, '7c00c31f-02a2-431b-a173-ab91b9b03a6b', null, true),
       (18, '5802e255-3604-4161-bcaa-85ce077a01f4', null, false)
;