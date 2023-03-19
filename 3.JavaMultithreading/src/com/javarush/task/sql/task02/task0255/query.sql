select name, min(price), max(price)
from cars
group by name
having max(price) < 200000