select *
from event
where date_time between date_sub(curdate(), interval 14 day) and curdate();