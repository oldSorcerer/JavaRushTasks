select id, if(salary > 1000, 'yas', 'no')
from employee
where id < 5;