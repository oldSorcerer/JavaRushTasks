select c.customer_id,
       o.order_id
from customers as c
         left join orders as o
                   on c.customer_id = o.customer_id
where o.shipped_date is null
