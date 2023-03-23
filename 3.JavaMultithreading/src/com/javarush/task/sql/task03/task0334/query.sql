select
author.last_name as author,
author.country as author_country,
book.genre as book_genre
from authors as author
left join books as book
on authors.id = books.id
where books.genre = 'fantasy'
group by authors.last_name, authors.country, books.genre
order by authors.country asc
limit 5

