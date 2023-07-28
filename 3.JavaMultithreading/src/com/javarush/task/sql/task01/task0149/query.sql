SELECT *
FROM parts
WHERE description IS NOT NULL
   OR identifier IS NULL;