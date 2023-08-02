select *
from films
         join
     (select year_born, id from film_directors where film_directors.year_born < 1940) as director
     on director.id = films.director_id
where films.genre = 'sci-fi'