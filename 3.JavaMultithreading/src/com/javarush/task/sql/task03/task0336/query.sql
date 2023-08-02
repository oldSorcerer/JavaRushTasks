select year_born
from authors
where year_born <= (select max(date_released)
                    from books)
