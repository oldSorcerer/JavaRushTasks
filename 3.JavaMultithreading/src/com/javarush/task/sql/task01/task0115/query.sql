SELECT id, salary, department, name
FROM employee
WHERE salary < 5000
  AND department = 'dev';