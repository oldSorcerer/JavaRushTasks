select *
from films
where title like
      (select title
       from films
       where title like 'The%r'
       limit 1)