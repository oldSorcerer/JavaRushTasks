select
ret.name as ret_name,
ret.annual_revenue_billions as ret_revenue,
supplier.name as sup_name
from top_retailers as ret, suppliers as supplier