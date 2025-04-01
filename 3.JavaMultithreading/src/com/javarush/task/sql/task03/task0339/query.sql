select *
from authors
where author_id in
      (select author_id from books where genre = 'fantasy');