select year(date_of_birth), month(date_of_birth)
from employee
where month(date_of_birth) in (1, 2, 12)