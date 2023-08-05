select name,
       year(discovery_date)      as d_year,
       monthname(discovery_date) as d_month,
       dayname(discovery_date)   as d_day
from object