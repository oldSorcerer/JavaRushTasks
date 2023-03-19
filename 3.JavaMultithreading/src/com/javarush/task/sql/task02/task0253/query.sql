select name, sum(price)
from cars
group by name
having sum(price) > 200000
