SELECT required, identifier, description
FROM parts
WHERE description IS NULL
   OR required IS true;