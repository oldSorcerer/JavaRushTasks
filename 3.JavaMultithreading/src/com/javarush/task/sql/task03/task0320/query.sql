select
retailer.ret_name,
retailer.ret_revenue,
supplier.sup_name,
supplier.sup_revenue
from top_retailers as retailer
join suppliers as supplier
on retailer.ret_revenue = supplier.sup_revenue
where supplier.sup_revenue > 50
