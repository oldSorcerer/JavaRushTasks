select a.full_name, count(distinct p.name) publishers
from author a
         left join book b on a.id = b.author_id
         left join publisher p on p.id = b.publisher_id
group by a.id;

/*
select author.full_name, count(distinct publisher.name) as publisher
from author
         left join book on author.id = book.author_id
         left join publisher on book.publisher_id = publisher.id
group by author.id;
 */

