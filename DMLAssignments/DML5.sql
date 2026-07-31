DELETE FROM MY_EMPLOYEE;
WHERE LOWER(first_name) LIKE '%man%'
   OR LOWER(last_name) LIKE '%man%';
   
   SELECT employee_id, first_name, last_name
FROM employees
WHERE LOWER(first_name) LIKE '%man%'
   OR LOWER(last_name) LIKE '%man%';