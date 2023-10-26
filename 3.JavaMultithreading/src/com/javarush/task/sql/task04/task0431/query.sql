select dayname(date), count(*)
from event
where type = 'REGISTRATION'
group by dayname(date)
order by count(*) desc
limit 1;