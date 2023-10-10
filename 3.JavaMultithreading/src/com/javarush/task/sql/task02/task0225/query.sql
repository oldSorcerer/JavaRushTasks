select prod_year, count(*)
from cars
where name = 'Blue Car'
group by prod_year;