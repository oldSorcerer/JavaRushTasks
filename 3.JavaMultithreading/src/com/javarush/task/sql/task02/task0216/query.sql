select
    case
           when position = 'backend developer' then 'yes'
           when position = 'frontend developer' then 'yes'
           else 'no'
    end
from employee
where department = 'cool devs';