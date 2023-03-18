select department, count(*)
from employee
where position = 'backend developer'
group by department