select customers.phone as cust_phone,
       orders.order_date,
       orders.total_cost,
       orders.store_id
from customers
         right join orders
                    on customers.customer_id = orders.customer_id
where customers.city = 'Dallas'
  and orders.order_status = 'PROCESSING'
