select isbn, title
from book
         join author on author.id = book.author_id
where last_name like 'S%'