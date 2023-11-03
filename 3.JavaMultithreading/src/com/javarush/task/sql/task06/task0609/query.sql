insert into sale_addresses (street, city, state, zip_code, country)
select street, city, state, zip_code, country
from customers
where country not like '%Testostan%';