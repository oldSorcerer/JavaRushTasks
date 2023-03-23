select
author.country as author_country,
count(books.book_id) as book_count
from authors as author
join books as book
on author.id = book.author_id
where book.genre = 'novel'
group by author.country
having count(books.book_id) > 2
