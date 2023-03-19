select department, position, count(*) as total
from employee
group by department, position
having total = 1