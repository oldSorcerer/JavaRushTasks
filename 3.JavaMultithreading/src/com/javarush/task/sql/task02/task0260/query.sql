select rating, group_concat(name)
from employee
group by rating
having rating > 2;