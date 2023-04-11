select distinct book.title
from book
         left join author on author.id = book.author_id
where author.full_name = 'Edgar Allan Poe'
