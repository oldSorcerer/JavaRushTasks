select last_name
from film_directors
         left join (select grossed, director_id
                    from films
                    where grossed > 100) as film
                   on film_directors.id = film.director_id
where film_directors.country = 'UK';