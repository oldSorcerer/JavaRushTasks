select year(prod_date)  as prod_year,
       month(prod_date) as prod_month,
       count(*)
from cars
where name = 'Black Car'
  and price > 99000
group by prod_year, prod_date;