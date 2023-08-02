select r.ret_name,
       r.ret_location,
       s.sup_name,
       s.sup_country
from top_retailers as r
         join suppliers as s
              on r.ret_location = s.sup_country