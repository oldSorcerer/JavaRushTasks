select *
from authors
where id in
(
select author_id from books where genre = 'fantasy'
)