select * from authors where id !=
(select author_id
from books
where author_id = 7 and title = 'War and Peace')