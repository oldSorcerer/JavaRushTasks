select full_name
from film_directors
         left join (select title, director_id from films where films.genre = 'comedy') as f
                   on film_directors.id = f.director_id;