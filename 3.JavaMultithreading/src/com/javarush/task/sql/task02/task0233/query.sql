select year(date_of_birth), count(*)
from employee
group by year(date_of_birth)