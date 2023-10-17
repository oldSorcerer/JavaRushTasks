select customers.last_name as surname,
       orders.order_id
from customers
         left join orders
                   on customers.customer_id = orders.customer_id;