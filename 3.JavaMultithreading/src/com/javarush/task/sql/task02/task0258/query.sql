select position, group_concat(name)
from employee
group by position
