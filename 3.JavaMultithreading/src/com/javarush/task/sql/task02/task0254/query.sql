select name, min(price), max(price)
from cars
group by name;