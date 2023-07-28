SELECT department, salary, name
FROM employee
WHERE salary > 2200
  AND NOT department != 'qa';