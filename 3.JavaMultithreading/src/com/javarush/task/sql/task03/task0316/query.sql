select retailer.name        as ret_name,
       retailer.hq_location as ret_location,
       supplier.name        as sup_name
from top_retailers as retailer,
     suppliers as supplier
where retailer.annual_revenue_billions > 100