select author.last_name as author,
       author.country   as author_country,
       book.genre       as book_genre
from authors as author
         left join books as book
                   on author.id = book.author_id
where book.genre = 'fantasy'
group by author.last_name, author.country, book.genre
order by author.country asc
limit 5

