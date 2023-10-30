select isbn, title
from book
         left join author on author.id = book.author_id
where author.last_name like 'S%';