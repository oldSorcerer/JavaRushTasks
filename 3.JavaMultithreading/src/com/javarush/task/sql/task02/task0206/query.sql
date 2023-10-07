select *, if(salary <= 500, 1000, 0)
from employee
where id > 5
limit 10;