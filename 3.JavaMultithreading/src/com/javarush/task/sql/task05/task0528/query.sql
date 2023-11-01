select distinct publisher.name
from publisher
         left join book on publisher.id = book.publisher_id
         left join author on author.id = book.author_id
where author.full_name = 'Mark Twain'


--select publisher.name
--from book
--         left join author on author.id = book.author_id
--         left join publisher on publisher.id = book.publisher_id
--where author.full_name = 'Mark Twain'
--group by publisher.name;
