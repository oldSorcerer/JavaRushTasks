select a.last_name            as author,
       b.title                as book_title,
       b.copies_sold_millions as books_sold
from authors as a
         right join books as b
                    on a.author_id = b.author_id
where b.copies_sold_millions > 50