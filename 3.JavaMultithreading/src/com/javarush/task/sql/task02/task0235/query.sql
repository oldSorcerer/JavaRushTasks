select year(date_of_birth) as year_of_birth, count(*)
from employee
where position like '%developer%'
group by year(date_of_birth);