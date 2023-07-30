select
    case
           when euro > 5 then 'best'
           when euro = 5 then 'good'
           else 'bad'
    end
from cars
where prod_year > 2020
order by price
limit 5
