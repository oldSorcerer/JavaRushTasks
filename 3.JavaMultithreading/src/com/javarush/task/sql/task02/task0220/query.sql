select distinct name,
    case prod_year
        when 2020 then 'new'
        when 2021 then 'newer'
        when 2022 then 'even newer'
    end
from cars