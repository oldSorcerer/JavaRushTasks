select department, position, count(*) as total
from employee
group by department, position
having position = 'frontend developer'
   and total > 1
limit 1;