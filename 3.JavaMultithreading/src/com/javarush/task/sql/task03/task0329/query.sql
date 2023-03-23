select
c.customer_id,
o.order_status
from customers as c
join orders as o
on c.customer_id = o.customer_id
