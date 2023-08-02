select *
from customers
         join orders
              on customers.customer_id = orders.customer_id
where orders.total_cost > 100