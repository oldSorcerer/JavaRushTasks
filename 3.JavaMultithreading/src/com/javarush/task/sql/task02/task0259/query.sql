select position, group_concat(name)
from employee
group by position
having position like '%developer%'
