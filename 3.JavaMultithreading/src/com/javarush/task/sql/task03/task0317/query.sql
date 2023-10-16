select *
from top_retailers
         join suppliers
              on top_retailers.ret_location = suppliers.sup_country;