select name, position
from employee
where DAYNAME(date_of_birth) = 'Monday'