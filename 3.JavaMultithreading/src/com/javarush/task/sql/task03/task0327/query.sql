select
customers.city,
orders.store_id
from customers
right join orders
on customers.customer_id = orders.customer_id
where orders.order_status = 'SHIPPED' and orders.total_cost > 100