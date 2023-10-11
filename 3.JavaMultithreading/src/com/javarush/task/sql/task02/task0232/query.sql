select is_full_time, count(*)
from students
group by is_full_time;