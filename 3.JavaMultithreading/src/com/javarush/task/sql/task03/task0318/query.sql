select top_retailers.ret_name,
       top_retailers.ret_revenue,
       suppliers.sup_name,
       suppliers.sup_revenue
from top_retailers
         join suppliers
              on top_retailers.ret_revenue = suppliers.sup_revenue;