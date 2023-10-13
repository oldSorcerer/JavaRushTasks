select name, count(*) as car_count
from cars
group by name
having car_count < 3;