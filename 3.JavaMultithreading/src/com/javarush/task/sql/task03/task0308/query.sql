select g.location, person.name, person.email, person.telephone
from gyms as g,
     customers as person
where person.name = 'Hulk';