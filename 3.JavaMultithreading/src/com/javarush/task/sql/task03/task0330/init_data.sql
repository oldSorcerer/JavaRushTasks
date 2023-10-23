DROP TABLE IF EXISTS 'customers';
DROP TABLE IF EXISTS 'orders';

CREATE TABLE `customers`
(
    `customer_id` INT          not null,
    `first_name`  VARCHAR(100) not null,
    `last_name`   VARCHAR(100) not null,
    `phone`       VARCHAR(20)  not null,
    `email`       VARCHAR(200) not null,
    `street`      VARCHAR(200) not null,
    `city`        VARCHAR(50)  not null,
    `zip_code`    INT          not null
);

CREATE TABLE `orders`
(
    `order_id`     INT            not null,
    `customer_id`  INT            not null,
    `order_date`   VARCHAR(100)   not null,
    `order_status` VARCHAR(100)   not null,
    `total_cost`   DECIMAL(10, 2) not null,
    `shipped_date` VARCHAR(100) null,
    `store_id`     INT            not null,
    `staff_id`     INT            not null
);

insert into customers (customer_id, first_name, last_name, phone, email, street, city, zip_code)
values (1, 'Jack', 'Sparrow', '123456789', 'email@sdknasdb.com', 'Street 111', 'San Diego', 01010),
       (2, 'John', 'Wick', '123456789', 'email@ofnwub.com', 'Street 10', 'Denver', 03927),
       (3, 'Jane', 'Watson', '327191076', 'email@jcpsnag.com', 'Street 3', 'Miami', 04857),
       (4, 'Mary', 'Thornton', '192746482', 'email@ncowb.com', 'Street 1', 'Boston', 08772),
       (5, 'Bill', 'Stevenson', '987654321', 'email@cpwiryvb.com', 'Street 2', 'Charlotte', 23761),
       (6, 'Hannah', 'Montana', '825379163', 'email@snbzolf.com', 'Street 41', 'Miami', 12345),
       (7, 'Billy', 'Kid', '128746027', 'email@shxohfm.com', 'Street 200', 'Atlanta', 98765),
       (8, 'Wallace', 'Jules', '284647290', 'email@nvnmxkp.com', 'Street 11', 'Houston', 23456),
       (9, 'Henrique', 'Gonzalez', '012836449', 'email@vnvjeuip.com', 'Street 222', 'Washington', 34567),
       (10, 'Sarah', 'Conor', '028364564', 'email@nviywb.com', 'Street 99', 'Dallas', 45678)
;

insert into orders (order_id, customer_id, order_date, order_status, total_cost, shipped_date, store_id, staff_id)
values (1001, 10, '25/01/2021', 'PAID', 999.99, null, 76, 115),
       (1330, 3, '10/01/2021', 'SHIPPED', 110.00, '12/01/2021', 2, 100),
       (1234, 5, '21/01/2021', 'REFUND', 49.99, '25/01/2021', 13, 42),
       (2345, 3, '30/01/2021', 'PROCESSING', 25.50, null, 26, 55),
       (1002, 4, '12/12/2021', 'REFUND', 15.99, '15/12/2021', 53, 97),
       (2004, 1, '21/01/2021', 'SHIPPED', 35.50, '23/01/2021', 90, 23),
       (2512, 9, '22/02/2021', 'SHIPPED', 19.99, '18/10/2020', 20, 34),
       (1543, 6, '28/12/2020', 'SHIPPED', 29.99, '02/01/2021', 8, 21),
       (0123, 8, '11/11/2020', 'SHIPPED', 115.50, '14/11/2020', 37, 57),
       (0981, 2, '30/11/2020', 'SHIPPED', 55, '02/12/2020', 28, 93),
       (0852, 4, '25/11/2020', 'SHIPPED', 75.99, '27/11/2020', 25, 111),
       (0613, 6, '22/11/2020', 'SHIPPED', 49.99, '25/11/2020', 5, 42),
       (1111, 10, '15/10/2020', 'PROCESSING', 95, null, 27, 33),
       (2222, 2, '15/12/2020', 'SHIPPED', 150, '19/12/2020', 27, 99),
       (1568, 7, '17/12/2020', 'SHIPPED', 2155.99, '20/12/2020', 27, 10)
;