select year(date_time), month(date_time), day(date_time), count(*)
from event
group by year(date_time), month(date_time), day(date_time)
having count(*) > 5;