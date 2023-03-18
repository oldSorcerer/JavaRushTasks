select name as car_name, count(*) as car_count
from cars
group by name