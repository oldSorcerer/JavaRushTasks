select c.customer_id,
       c.email,
       o.order_id,
       o.order_status
from customers as c
         join orders as o
              on c.customer_id = o.customer_id
where o.order_status = 'PAID'
   or o.order_status = 'PROCESSING';