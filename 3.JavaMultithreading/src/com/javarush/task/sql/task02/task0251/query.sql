select department, position, count(*) as total
from employee
group by department, position
having total = 1
    or position = 'manager'
limit 2 offset 1
