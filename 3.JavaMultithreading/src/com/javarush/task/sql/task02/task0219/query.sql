select case
           when euro is null then 'good'
           else 'bad'
           end as tmp
from cars;