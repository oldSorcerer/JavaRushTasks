SELECT description
FROM parts
ORDER BY required DESC, identifier DESC, description DESC
LIMIT 1 OFFSET 23;