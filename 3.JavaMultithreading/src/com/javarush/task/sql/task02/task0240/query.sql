select if(year(date_of_birth) < 2000, 'yes', 'no') as experienced,
month(date_of_birth) as month_of_birth
from employee
