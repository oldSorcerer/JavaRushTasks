select *
from object
where year(discovery_date) >= 2010
  and month(discovery_date) >= 1
  and year(discovery_date) <= 2020
  and month(discovery_date) <= 12
