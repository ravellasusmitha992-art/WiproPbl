UPDATE employees
SET salary = salary * 1.10
WHERE department_id = 90;

SELECT employee_id, first_name, salary
FROM employees
WHERE department_id = 90;