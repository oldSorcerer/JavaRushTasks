select name, department
from employee
where DAYOFYEAR(date_of_birth) < 200;