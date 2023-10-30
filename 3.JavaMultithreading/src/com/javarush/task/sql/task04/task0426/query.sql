select YEAR(date), MONTH(date), day(date), sum(total)
from data
group by YEAR(date), MONTH(date), day(date);