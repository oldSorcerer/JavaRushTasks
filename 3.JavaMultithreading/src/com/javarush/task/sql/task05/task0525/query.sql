select author.full_name, count(*) as books
from book
         left join author on author.id = book.author_id
group by book.author_id
having books > 1