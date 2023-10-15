select gym.id, gym.name, cust.id
from gyms as gym,
     customers as cust
where cust.id < 50;