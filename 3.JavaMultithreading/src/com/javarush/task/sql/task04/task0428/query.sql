select *
from event
where year(date_time) = year(curdate())
  and month(date_time) = month(curdate());