select year(date), month(date), day(date), count(*)
from event
group by year(date), month(date), day(date)
having count(*) > 5;