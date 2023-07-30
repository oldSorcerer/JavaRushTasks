select
    case is_full_time
       when 0 then 'false'
       when 1 then 'true'
    end
from students