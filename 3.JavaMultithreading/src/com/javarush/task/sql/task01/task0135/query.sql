SELECT country_code, ip_from, ip_to
FROM ip2country
WHERE country_code = 'DE'
LIMIT 5 OFFSET 3;