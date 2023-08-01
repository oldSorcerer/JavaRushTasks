select gym.location, person.location
from gyms as gym,
     customers as person
where person.location != 'London'
group by gym.location, person.location