select name, count(*)
from cars
group by name
having count(*) > 1;