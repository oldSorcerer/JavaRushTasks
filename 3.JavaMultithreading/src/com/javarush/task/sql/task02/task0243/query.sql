select
    year(prod_date) as prod_year,
    month(prod_date) as prod_month,
    count(*)
from cars
group by prod_year, prod_month
