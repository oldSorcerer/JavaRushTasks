select name, count(*)
from cars
where prod_year = 2021
group by name