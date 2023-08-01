select department, position, count(*) as total
from employee
group by department, position
having position = 'backend developer'
   and total = 1
