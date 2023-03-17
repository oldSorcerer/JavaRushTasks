select
case
    when experience < 1 then 'junior'
    when experience < 3 then 'middle'
    when experience < 5 then 'senior'
end
from developers