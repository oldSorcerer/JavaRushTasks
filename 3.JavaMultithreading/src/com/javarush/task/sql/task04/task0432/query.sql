select monthname(date), count(*)
from event
where status = 'ERROR'
   or status = 'FAILED'
group by monthname(date)
order by count(*) desc
limit 1
